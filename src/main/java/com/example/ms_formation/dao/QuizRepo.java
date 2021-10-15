package com.example.ms_formation.dao;

import com.example.ms_formation.entites.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepo extends JpaRepository<Quiz,Long> {
}
