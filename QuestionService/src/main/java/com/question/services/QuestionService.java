package com.question.services;

import com.question.entities.Question;
import com.question.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface QuestionService
{
  Question create(Question question);

  List<Question> getAll();

  Question getSingle(Long id);

  List<Question> getQuestionsOfQuiz(Long quizId);
}
