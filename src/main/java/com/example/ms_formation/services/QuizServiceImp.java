package com.example.ms_formation.services;

import com.example.ms_formation.dao.QuizRepo;
import com.example.ms_formation.entites.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuizServiceImp implements QuizService{
    @Autowired
QuizRepo quizRepo;
    @Override
    public Quiz ajouterQuiz(Quiz quiz) {
        return quizRepo.save(quiz);
    }

    @Override
    public Quiz getQuizById(Long id) {
        return quizRepo.getById(id);
    }

    @Override
    public List<Quiz> getAllQuiz() {
        return quizRepo.findAll();
    }

    @Override
    public void SupprimerQuiz(Long id) {

      quizRepo.deleteById(id);
    }
}
