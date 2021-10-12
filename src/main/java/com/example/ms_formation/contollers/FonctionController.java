package com.example.ms_formation.contollers;

import com.example.ms_formation.entites.Fonction;
import com.example.ms_formation.services.FonctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FonctionController {

    @Autowired
    FonctionService fonctionService;

    @PostMapping(path = "/fonctions")
    public Fonction saveFonction(Fonction fonction){
        return fonctionService.ajouterFonction(fonction);
    }

    @GetMapping(path = "/fonctions/{id}")
    public Fonction getFonction(@PathVariable(name = "id") Long id){
        return fonctionService.getFonctionById(id);
    }

    @GetMapping(path = "/fonctions")
    public List<Fonction> allFonctions(){
        return fonctionService.getAllFonctions();
    }

    @DeleteMapping(path = "/fonctions/{id}")
    public void deleteFonction(@PathVariable(name = "id") Long id) {
        fonctionService.SupprimerFonction(id);
    }
}
