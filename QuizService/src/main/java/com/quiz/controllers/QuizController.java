package com.quiz.controllers;

import com.quiz.entities.Quiz;
import com.quiz.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController
{
    @Autowired
    private QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    //Create Quiz
    @PostMapping
    public Quiz create(@RequestBody Quiz quiz)
    {
        return quizService.add(quiz);
    }

    //Get All Quiz
    @GetMapping
    public List<Quiz> get()
    {
        return quizService.get();
    }

    //Get Single Quiz
    @GetMapping("/{id}")
    public Quiz getSingle(@PathVariable Long id)
    {
        return quizService.getSingle(id);
    }
}
