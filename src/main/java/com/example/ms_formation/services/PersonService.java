package com.example.ms_formation.services;


import com.example.ms_formation.entites.Formation;
import com.example.ms_formation.entites.Person;

import java.util.List;

public interface PersonService {
    Person ajouterPerson(Person person);
    Person getPersonById(Long id);
    List<Person> getAllPers();
    void SupprimerPers(Long id);

    double pourcentage(Person person);
}
