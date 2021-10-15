package com.example.ms_formation.dao;

import com.example.ms_formation.entites.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepo extends JpaRepository<Question,Long> {
}
