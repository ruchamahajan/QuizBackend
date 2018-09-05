package com.quiz.krishna.repository;

import com.quiz.krishna.model.Quiz;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface QuizRepository extends CrudRepository<Quiz, Long> {

    List<Quiz> findQuizByCategory(String category);
    List<Quiz> findQuizByCategoryAndAndLevel(String Category, Integer level);
    List<Quiz> findQuizByTags(String tag);
}

