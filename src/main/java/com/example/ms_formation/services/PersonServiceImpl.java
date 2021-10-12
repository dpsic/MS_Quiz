package com.example.ms_formation.services;

import com.example.ms_formation.dao.FonctionRepo;
import com.example.ms_formation.dao.PersonRepo;
import com.example.ms_formation.dao.ValidationRepo;
import com.example.ms_formation.entites.Formation;
import com.example.ms_formation.entites.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{

    @Autowired PersonRepo personRepo;
    @Autowired ValidationRepo validationRepo;
    @Autowired FonctionRepo fonctionRepo;

    @Override
    public Person ajouterPerson(Person person) {
        return personRepo.save(person);
    }

    @Override
    public Person getPersonById(Long id) {
        return personRepo.findById(id).get();
    }

    @Override
    public List<Person> getAllPers() {
        return personRepo.findAll();
    }

    @Override
    public void SupprimerPers(Long id) {
        personRepo.deleteById(id);
    }

    @Override
    public double pourcentage(Person person) {

        // La liste des formations validées par une personne.  <realisé>
        List<Formation> persForm = new ArrayList<>();
        persForm = validationRepo.personFormations(person);

        //La liste des formations nécéssaires pour une fonction.  <nécéssaire>
        List<Formation> fonctionForm = new ArrayList<>();
        fonctionForm = fonctionRepo.getFormationsByfonction(person.getFonction());

        //Calcule du pourcentage d'adaptation.
        double compteur=0;
        for (Formation f: persForm){
            if (fonctionForm.contains(f)){
                compteur++;
            }
        }
        return (compteur*100)/fonctionForm.size();
    }
}
