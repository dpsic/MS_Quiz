package com.example.ms_formation.services;

import com.example.ms_formation.dao.ValidationRepo;
import com.example.ms_formation.entites.Validation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ValidationServiceImpl implements ValidationService{

    @Autowired
    ValidationRepo validationRepo;

    @Override
    public Validation ajouterValidation(Validation validation) {
        return validationRepo.save(validation);
    }

    @Override
    public Validation getValidationById(Long id) {
        return validationRepo.findById(id).get();
    }

    @Override
    public List<Validation> getAllValidations() {
        return validationRepo.findAll();
    }

    @Override
    public void SupprimerValidation(Long id) {
        validationRepo.deleteById(id);
    }
}
