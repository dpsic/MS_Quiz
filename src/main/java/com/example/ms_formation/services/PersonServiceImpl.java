package com.example.ms_formation.services;

import com.example.ms_formation.doa.FormationRepo;
import com.example.ms_formation.doa.PersonRepo;
import com.example.ms_formation.entites.Formation;
import com.example.ms_formation.entites.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Service
public class PersonServiceImpl implements PersonService{
    @Autowired
    PersonRepo personRepo;
    @Autowired
    FormationRepo formationRepo;

    @Override
    public Person ajouter(Person person) {
        return personRepo.save(person);
    }

    @Override
    public Person persById(Long id) {
        return personRepo.findById(id).get();
    }

    @Override
    public List<Person> allPerson() {
        return personRepo.findAll();
    }

    @Override
    public void supprimer(Long id) {
        personRepo.deleteById(id);
    }

    @Override
    public void formToPers(Long idPers, Long idForm) {
        Person person=personRepo.findPersonById(idPers);
        Formation formation= formationRepo.findFormationById(idForm);
        person.getFormations().add(formation);
    }


}
