package com.quiz.krishna.repository;

import com.quiz.krishna.model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.Optional;

public class QuizRepositoryCustomImpl implements  QuizRepositoryCustom {

    @Autowired
    EntityManager em;

    @Transactional
    @Modifying
    public void removeById(Long id) {
            Quiz q = em.find(Quiz.class, id);
            em.remove(q);
    }

    @Transactional
    @Modifying
    public void removeQuiz(Quiz q) {
            em.remove(q);
    }

}
