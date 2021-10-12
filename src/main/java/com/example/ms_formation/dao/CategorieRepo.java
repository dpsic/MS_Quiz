package com.example.ms_formation.dao;

import com.example.ms_formation.entites.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepo extends JpaRepository<Categorie,Long> {
}
