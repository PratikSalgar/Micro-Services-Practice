package com.question.controllers;

import com.question.entities.Question;
import com.question.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController
{
    @Autowired
    private QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    //Create Question
    @PostMapping
    public Question create(@RequestBody Question question)
    {
        return questionService.create(question);
    }

    //Get All Question
    @GetMapping
    public List<Question> getAll()
    {
        return questionService.getAll();
    }

    //Get Single Question
    @GetMapping("/{questionId}")
    public Question getSingle(@PathVariable Long questionId)
    {
        return questionService.getSingle(questionId);
    }

    //Get all questions of specific quiz
    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionsOfQuiz(@PathVariable Long quizId)
    {
        return questionService.getQuestionsOfQuiz(quizId);
    }
}
