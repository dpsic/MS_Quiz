package com.example.ms_formation.services;



import com.example.ms_formation.entites.Reponse;

import java.util.List;

public interface ReponseService {
    Reponse ajouterReponse(Reponse reponse);
    Reponse getReponseById(Long id);
    List<Reponse> getAllReponse();
    void SupprimerReponse(Long id);
    Double note(Long id);
}
