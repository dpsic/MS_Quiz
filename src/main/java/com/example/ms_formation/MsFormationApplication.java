package com.example.ms_formation;

import com.example.ms_formation.dao.*;
import com.example.ms_formation.entites.*;
import com.example.ms_formation.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class MsFormationApplication {

    @Autowired PersonRepo personRepo;
    @Autowired FormationRepo formationRepo;
    @Autowired FonctionRepo fonctionRepo;
    @Autowired CategorieRepo categorieRepo;
    @Autowired ValidationRepo validationRepo;

    @Autowired RepositoryRestConfiguration restConfiguration;


    public static void main(String[] args) {
        SpringApplication.run(MsFormationApplication.class, args);
    }

    @Value("${spring.jpa.hibernate.ddl-auto}")
    String ddl;


    @Bean
    CommandLineRunner start(PersonRepo personRepo,
                            FormationRepo formationRepo,
                            FonctionRepo fonctionRepo,
                            CategorieRepo categorieRepo,
                            ValidationRepo validationRepo,
                            PersonService personService){
        return args -> {

            if ("create".equals(ddl)){
                //restConfiguration.exposeIdsFor(Person.class,Formation.class);

                //Categorie
                Categorie c1 = categorieRepo.save(Categorie.builder().label("Categorie A").build());
                Categorie c2 = categorieRepo.save(Categorie.builder().label("Categorie B").build());
                Categorie c3 = categorieRepo.save(Categorie.builder().label("Categorie C").build());

                //Formation
                Formation f1 = formationRepo.save(Formation.builder().label("Formation 1").categorie(c1).build());
                Formation f2 = formationRepo.save(Formation.builder().label("Formation 2").categorie(c2).build());
                Formation f3 = formationRepo.save(Formation.builder().label("Formation 3").categorie(c3).build());
                Formation f4 = formationRepo.save(Formation.builder().label("Formation 4").categorie(c1).build());

                //Fonction
                Fonction fnc1 = fonctionRepo.save(Fonction.builder().label("Fonction 1").formations(Arrays.asList(f1,f3)).build());
                Fonction fnc2 = fonctionRepo.save(Fonction.builder().label("Fonction 2").formations(Arrays.asList(f2,f4)).build());

                //Persons
                Person p1 = personRepo.save(Person.builder().nom("Salah").fonction(fnc1).build());
                Person p2 = personRepo.save(Person.builder().nom("Med").fonction(fnc2).build());

                //Validation
                validationRepo.save(Validation.builder().dateValidation(new Date()).person(p1).formation(f1).build());
                validationRepo.save(Validation.builder().dateValidation(new Date()).person(p1).formation(f3).build());
                validationRepo.save(Validation.builder().dateValidation(new Date()).person(p2).formation(f2).build());
                validationRepo.save(Validation.builder().dateValidation(new Date()).person(p1).formation(f4).build());
            }

            //System.err.println(personService.pourcentage(personRepo.findById(2L).get()));

        };
    }

}
