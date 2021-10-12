package com.example.ms_formation.services;

import com.example.ms_formation.dao.FormationRepo;
import com.example.ms_formation.entites.Formation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormationServiceImpl implements FormationService{

    @Autowired
    FormationRepo formationRepo;

    @Override
    public Formation ajouterFormation(Formation formation) {
        return formationRepo.save(formation);
    }

    @Override
    public Formation getFormationById(Long id) {
        return formationRepo.findById(id).get();
    }

    @Override
    public List<Formation> getAllFormations() {
        return formationRepo.findAll();
    }

    @Override
    public void SupprimerFormation(Long id) {
        formationRepo.deleteById(id);
    }
}
