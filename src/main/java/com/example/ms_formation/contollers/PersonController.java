package com.example.ms_formation.contollers;

import com.example.ms_formation.dao.PersonRepo;
import com.example.ms_formation.entites.Formation;
import com.example.ms_formation.entites.Person;
import com.example.ms_formation.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired PersonService personService;
    @Autowired PersonRepo personRepo;

    @PostMapping(path = "/persons")
    public Person savePerson(Person person){
        return personService.ajouterPerson(person);
    }

    @GetMapping(path = "/persons/{id}")
    public Person getPerson(@PathVariable(name = "id") Long id){
        return personService.getPersonById(id);
    }

    @GetMapping(path = "/persons")
    public List<Person> getAllPerson(){
        return personService.getAllPers();
    }

    @DeleteMapping(path = "/persons/{id}")
    public void deletePerson(@PathVariable(name = "id") Long id){
        personService.SupprimerPers(id);
    }

    @GetMapping(path = "/pourcentage")
    public double getPersForm(@RequestParam("id") Long id){
        Person p = personRepo.findById(id).get();
        return personService.pourcentage(p);
    }
}
