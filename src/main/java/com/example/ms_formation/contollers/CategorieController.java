package com.example.ms_formation.contollers;

import com.example.ms_formation.entites.Categorie;
import com.example.ms_formation.services.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategorieController {

    @Autowired
    CategorieService categorieService;

    @PostMapping(path = "/categories")
    public Categorie saveCategorie(Categorie categorie){
        return categorieService.ajouterCategorie(categorie);
    }

    @GetMapping(path = "/categories/{id}")
    public Categorie getCategorie(@PathVariable(name = "id") Long id){
        return categorieService.getCategorieById(id);
    }

    @GetMapping(path = "/categories")
    public List<Categorie> allCategorie(){
        return categorieService.getAllCategories();
    }

    @DeleteMapping(path = "/categories/{id}")
    public void deleteCategorie(@PathVariable(name = "id") Long id){
        categorieService.SupprimerCategorie(id);
    }
}
