package com.example.ms_formation.services;

import com.example.ms_formation.dao.CategorieRepo;
import com.example.ms_formation.entites.Categorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieServiceImpl implements CategorieService{

    @Autowired
    CategorieRepo categorieRepo;

    @Override
    public Categorie ajouterCategorie(Categorie categorie) {
        return categorieRepo.save(categorie);
    }

    @Override
    public Categorie getCategorieById(Long id) {
        return categorieRepo.findById(id).get();
    }

    @Override
    public List<Categorie> getAllCategories() {
        return categorieRepo.findAll();
    }

    @Override
    public void SupprimerCategorie(Long id) {
        categorieRepo.deleteById(id);
    }
}
