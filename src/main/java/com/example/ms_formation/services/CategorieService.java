package com.example.ms_formation.services;

import com.example.ms_formation.entites.Categorie;


import java.util.List;

public interface CategorieService {
    Categorie ajouterCategorie(Categorie categorie);
    Categorie getCategorieById(Long id);
    List<Categorie> getAllCategories();
    void SupprimerCategorie(Long id);
}
