package com.quiz.krishna.repository;

import com.quiz.krishna.model.Quiz;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
@SpringBootTest

public class QuizRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private QuizRepository quizRepository;

    @Test
    public void saveQuizTest() {
    /*    Quiz q = new Quiz();
        q.setQuestion("What is the Independence day Of USA?");
        q.setAnswer(3);
        q.setOpt1("15th August");
        q.setOpt2("18th February");
        q.setOpt3("4th July");
        q.setOpt4("28th May");
        q.setCategory("Test");
        q.setNote("Note");
        q.setLevel(0);
        q.setTags("Test");

        Quiz retVal = quizRepository.save(q);

        assertThat(q.getQuestion().equals(retVal.getQuestion()));
        */
    }

    // write test cases here
    @Test
    public void whenFindByCategory_ThenReturnQuiz() {


    }


}
