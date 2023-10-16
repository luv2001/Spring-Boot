package com.luv.quizapp.service;

import com.luv.quizapp.dao.QuestionDao;
import com.luv.quizapp.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QuestionService {

    @Autowired
    private QuestionDao questionDao;

    public List<Question> getAllQuestions() {
        return questionDao.getAllQuestions();
    }

    public List<Question> getQuestionsByCategory(String category) {
        return questionDao.getQuestionsByCategory(category);
    }
}
