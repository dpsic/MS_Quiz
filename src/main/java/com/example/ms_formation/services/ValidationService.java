package com.example.ms_formation.services;

import com.example.ms_formation.entites.Categorie;
import com.example.ms_formation.entites.Validation;

import java.util.List;

public interface ValidationService {
    Validation ajouterValidation(Validation validation);
    Validation getValidationById(Long id);
    List<Validation> getAllValidations();
    void SupprimerValidation(Long id);
}
