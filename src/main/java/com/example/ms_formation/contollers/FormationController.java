package com.example.ms_formation.contollers;

import com.example.ms_formation.entites.Fonction;
import com.example.ms_formation.entites.Formation;
import com.example.ms_formation.services.FormationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FormationController {

    @Autowired
    FormationService formationService;

    @PostMapping(path = "/formations")
    public Formation saveFormation(Formation formation){
        return formationService.ajouterFormation(formation);
    }

    @GetMapping(path = "/formations/{id}")
    public Formation getFormation(@PathVariable(name = "id") Long id){
        return formationService.getFormationById(id);
    }

    @GetMapping(path = "/formations")
    public List<Formation> allFormation(){
        return formationService.getAllFormations();
    }

    @DeleteMapping(path = "/formations/{id}")
    public void deleteFormation(@PathVariable(name = "id") Long id){
        formationService.SupprimerFormation(id);
    }
}
