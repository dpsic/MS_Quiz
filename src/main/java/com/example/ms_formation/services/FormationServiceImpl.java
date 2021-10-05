package com.example.ms_formation.services;

import com.example.ms_formation.doa.FormationRepo;
import com.example.ms_formation.entites.Formation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FormationServiceImpl implements FormationService{

    @Autowired
    FormationRepo formationRepo;

    @Override
    public Formation ajouter(Formation formation) {
        return formationRepo.save(formation);
    }

    @Override
    public Formation frmById(Long id) {
        return formationRepo.findById(id).get();
    }

    @Override
    public List<Formation> allFrm() {
        return formationRepo.findAll();
    }

    @Override
    public void supprimer(Long id) {
        formationRepo.deleteById(id);
    }
}
