package com.example.ms_formation.services;

import com.example.ms_formation.entites.Formation;
import com.example.ms_formation.entites.Person;

import java.util.List;

public interface FormationService {
    Formation ajouter(Formation formation);
    Formation frmById(Long id);
    List<Formation> allFrm();
    void supprimer(Long id);
}
