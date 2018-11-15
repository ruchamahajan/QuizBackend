package com.quiz.krishna.controller;

import com.quiz.krishna.model.Quiz;
import com.quiz.krishna.repository.QuizRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpStatus;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@WebMvcTest(value = QuizController.class, secure = false)
public class QuizControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    QuizRepository quizRep;

    String exampleQuizJson = "{ \"answer\" : 2 ,\n" +
            "  \"category\" : \"Test\",\n" +
            "  \"level\" : null,\n" +
            "  \"note\" : \"Test\",\n" +
            "  \"opt1\" : \"Test\",\n" +
            "  \"opt2\" : \"Test\",\n" +
            "  \"opt3\" : \"Test\",\n" +
            "  \"opt4\" : \"Test\",\n" +
            "  \"question\" : \"Test\",\n" +
            "  \"tags\" : \"Test\"\n" +
            "}";

    @Test
    public void addQuizTest() throws Exception {
        Quiz mockQuiz = new Quiz();
        mockQuiz.setQuestion("What is the Independence day Of USA?");
        mockQuiz.setAnswer(3);
        mockQuiz.setOpt1("15th August");
        mockQuiz.setOpt2("18th February");
        mockQuiz.setOpt3("4th July");
        mockQuiz.setOpt4("28th May");
        mockQuiz.setCategory("Test");
        mockQuiz.setNote("Note");
        mockQuiz.setLevel(0);
        mockQuiz.setTags("Test");
        mockQuiz.setId(1L);
        // studentService.addCourse to respond back with mockCourse
        Mockito.when(
                quizRep.save(Mockito.any(Quiz.class))).thenReturn(mockQuiz);

        // Send course as body to /students/Student1/courses
        RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/questions/add")
                .accept(MediaType.APPLICATION_JSON).content(exampleQuizJson)
                .contentType(MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc.perform(requestBuilder).andReturn();

        MockHttpServletResponse response = result.getResponse();

        assertEquals(HttpStatus.CREATED.value(), response.getStatus());

        assertEquals("http://localhost/questions/quiz/1",
                response.getHeader(HttpHeaders.LOCATION));

    }
}
