package com.example.ms_formation.services;

import com.example.ms_formation.entites.Formation;


import java.util.List;

public interface FormationService {
    Formation ajouterFormation(Formation formation);
    Formation getFormationById(Long id);
    List<Formation> getAllFormations();
    void SupprimerFormation(Long id);
}
