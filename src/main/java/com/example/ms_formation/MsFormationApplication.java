package com.example.ms_formation;

import com.example.ms_formation.doa.FormationRepo;
import com.example.ms_formation.doa.PersonRepo;
import com.example.ms_formation.entites.Formation;
import com.example.ms_formation.entites.Person;
import com.example.ms_formation.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.ArrayList;

@SpringBootApplication
public class MsFormationApplication implements CommandLineRunner {

    @Autowired PersonRepo personRepo;
    @Autowired FormationRepo formationRepo;
    @Autowired PersonService personService;
    @Autowired
    RepositoryRestConfiguration restConfiguration;


    public static void main(String[] args) {
        SpringApplication.run(MsFormationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        restConfiguration.exposeIdsFor(Person.class,Formation.class);

        personRepo.save(new Person(null,"Salaheddine",new ArrayList<>()));
        personRepo.save(new Person(null,"Nouhaila",new ArrayList<>()));

        formationRepo.save(new Formation(null,"Formation Java"));
        formationRepo.save(new Formation(null,"Formation Php"));


        personService.formToPers(1L,1L);
        personService.formToPers(1L,2L);
        personService.formToPers(2L,1L);
        personService.formToPers(2L,2L);

    }
}
