package com.quiz.krishna.repository;

import com.quiz.krishna.model.Quiz;

public interface QuizRepositoryCustom {

    void removeById(Long id);
    void removeQuiz(Quiz q);
}
