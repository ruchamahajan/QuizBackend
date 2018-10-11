package com.quiz.krishna.repository;

import com.quiz.krishna.model.Quiz;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.swing.text.html.Option;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Transactional
public class QuizRepManager /* implements QuizRepository */
{

/*
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void deleteById(Integer id) {
        Quiz q = entityManager.find(Quiz.class, id);
        entityManager.remove(q);
    }

    @Override
    public long count() {

        return 0;
    }

    @Override
    public void deleteById(Long id) {
        deleteById(id);
    }

    @Override
    public void delete(Quiz q) {
        entityManager.remove(q);
    }

    @Override
    public List<Quiz> findQuizByCategory(String category){


        return null;
    }


    @Override
    public Optional<Quiz> findById(Long id) {

        Quiz q = entityManager.find(Quiz.class, id);
        return Optional.of(q);
    }

    @Override
    public List<Quiz> findAllById(Iterable<Long> qidlist) {
        List<Quiz> quizList = new ArrayList<Quiz>();

        qidlist.forEach( q -> {
            Optional<Quiz> optq = findById(q);
            optq.ifPresent(quiz -> quizList.add(quiz));
        });

        return quizList;
    }

    @Override
    public List<Quiz> findAll() {
        //entityManager.
        return null;
    }

    @Override
    public List<Quiz> saveAll(Iterable q) {
        return null;
    }

    @Override
    public List<Quiz> findQuizByCategoryAndAndLevel(String Category, Integer level){

        return null;
    }

    @Override
    public List<Quiz> findQuizByTagsContaining(String tag) {
        return null;
    }

    @Override
    public     List<Quiz> findQuizByQuestionContaining(String searchStr){
        return null;
    }

    @Override
    public     Quiz save(Quiz q) {

        return  null;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteAll(Iterable q) {

    }
*/
}
