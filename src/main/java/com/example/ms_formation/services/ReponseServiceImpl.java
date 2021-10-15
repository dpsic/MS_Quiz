package com.example.ms_formation.services;

import com.example.ms_formation.dao.ReponseRepo;
import com.example.ms_formation.entites.Reponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReponseServiceImpl implements ReponseService{
    @Autowired
    ReponseRepo reponseRepo;
    @Override
    public Reponse ajouterReponse(Reponse reponse) {
        return null;
    }

    @Override
    public Reponse getReponseById(Long id) {
        return null;
    }

    @Override
    public List<Reponse> getAllReponse() {
        return null;
    }

    @Override
    public void SupprimerReponse(Long id) {

    }

    @Override
    public Double note(Long id) {
        return null;
    }
}
