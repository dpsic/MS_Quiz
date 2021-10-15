package com.example.ms_formation.services;



import com.example.ms_formation.entites.Quiz;

import java.util.List;

public interface QuizService {
    Quiz ajouterQuiz(Quiz quiz);
    Quiz getQuizById(Long id);
    List<Quiz> getAllQuiz();
    void SupprimerQuiz(Long id);
}

