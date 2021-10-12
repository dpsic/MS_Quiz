package com.example.ms_formation.contollers;

import com.example.ms_formation.entites.Validation;
import com.example.ms_formation.services.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ValidationController {

    @Autowired
    ValidationService validationService;

    @PostMapping(path = "/validations")
    public Validation saveValidation(Validation validation){
        return validationService.ajouterValidation(validation);
    }

    @GetMapping(path = "/validations/{id}")
    public Validation getValidation(@PathVariable(name = "id") Long id){
        return validationService.getValidationById(id);
    }

    @GetMapping(path = "/validations")
    public List<Validation> allValidation(){
        return validationService.getAllValidations();
    }

    @DeleteMapping(path = "/validations/{id}")
    public void deleteValidation(@PathVariable(name = "id") Long id){
        validationService.SupprimerValidation(id);
    }
}
