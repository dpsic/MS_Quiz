package com.example.ms_formation.services;

import com.example.ms_formation.dao.FonctionRepo;
import com.example.ms_formation.entites.Fonction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FonctionServiceImpl implements FonctionService{

    @Autowired
    FonctionRepo fonctionRepo;

    @Override
    public Fonction ajouterFonction(Fonction fonction) {
        return fonctionRepo.save(fonction);
    }

    @Override
    public Fonction getFonctionById(Long id) {
        return fonctionRepo.findById(id).get();
    }

    @Override
    public List<Fonction> getAllFonctions() {
        return fonctionRepo.findAll();
    }

    @Override
    public void SupprimerFonction(Long id) {
        fonctionRepo.deleteById(id);
    }
}
