package com.example.ms_formation.dao;

import com.example.ms_formation.entites.Formation;
import com.example.ms_formation.entites.Person;
import com.example.ms_formation.entites.Validation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ValidationRepo extends JpaRepository<Validation,Long> {

    @Query("select o.formation from Validation o where o.person = :p")
    public List<Formation> personFormations(@Param("p") Person person);
}
