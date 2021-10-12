package com.example.ms_formation.dao;

import com.example.ms_formation.entites.Formation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormationRepo extends JpaRepository<Formation,Long>{
    Formation findFormationByLabel(String label);
}
