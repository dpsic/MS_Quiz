package com.example.ms_formation.dao;

import com.example.ms_formation.entites.Fonction;
import com.example.ms_formation.entites.Formation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public interface FonctionRepo extends JpaRepository<Fonction,Long> {
    @Query("select o.formations from Fonction o where o =:f")
    public List<Formation> getFormationsByfonction(@Param("f")Fonction fonction);
}
