package com.example.ms_formation.services;

import com.example.ms_formation.entites.Question;
import java.util.List;

public interface QuestionService {
    Question ajouterQuestion(Question question);

    Question getQuestionById(Long id);
    List<Question> getAllQuestion();
    void SupprimerQuestion(Long id);

}
