package com.luv.quizapp.controller;

import com.luv.quizapp.model.Question;
import com.luv.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

//    @PostMapping(value = "/addQuestion")
//    public void addQuestion() {
//        questionService.addQuestion
//    }

    @GetMapping(value = "/getAllQuestions")
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @GetMapping(value = "/getQuestionsByCategory")
    public List<Question> getQuestionsByCategory(@RequestParam String category){
        return questionService.getQuestionsByCategory(category);
    }

}
