package com.example.ms_formation.services;

import com.example.ms_formation.dao.QuestionRepo;
import com.example.ms_formation.entites.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionServiceImpl implements QuestionService{
    @Autowired
    QuestionRepo questionRepo;
    @Override
    public Question ajouterQuestion(Question question) {
        return questionRepo.save(question);
    }

    @Override
    public Question getQuestionById(Long id) {
        return questionRepo.findById(id).get();
    }

    @Override
    public List<Question> getAllQuestion() {
        return questionRepo.findAll();
    }

    @Override
    public void SupprimerQuestion(Long id) {
questionRepo.deleteById(id);
    }
}
