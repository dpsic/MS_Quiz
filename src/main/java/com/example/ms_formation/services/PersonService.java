package com.example.ms_formation.services;

import com.example.ms_formation.entites.Person;

import java.util.List;

public interface PersonService {
  Person ajouter(Person person);
  Person persById(Long id);
  List<Person> allPerson();
  void supprimer(Long id);
  void formToPers(Long idPers,Long idForm);

}
