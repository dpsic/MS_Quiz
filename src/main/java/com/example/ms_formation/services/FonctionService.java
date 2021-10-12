package com.example.ms_formation.services;


import com.example.ms_formation.entites.Fonction;

import java.util.List;

public interface FonctionService {
    Fonction ajouterFonction(Fonction fonction);
    Fonction getFonctionById(Long id);
    List<Fonction> getAllFonctions();
    void SupprimerFonction(Long id);
}
