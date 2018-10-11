package com.quiz.krishna.controller;

import com.quiz.krishna.model.Quiz;
import com.quiz.krishna.repository.QuizRepManager;
import com.quiz.krishna.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.xml.ws.Response;
import java.util.List;
import java.util.Optional;

@RequestMapping("/questions")
@RestController
public class QuizController {

    @Autowired
    QuizRepository quizRep;

    @RequestMapping("/")
    public String index() {
        return "Jai Shri Krishna";
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value="/forCategoryAndLevel")
    @ResponseBody
    public Iterable<Quiz> getQuestionsForCategoryAndLevel(@RequestParam("category") String category,
                                                      @RequestParam("level") Integer level) {
        return quizRep.findAll();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value="/forTag")
    @ResponseBody
    public List<Quiz> getQuestionsForTag(@RequestParam("tag") String tag) {
        return quizRep.findQuizByTagsContaining(tag);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value="/add")
    @ResponseBody
    public Quiz addQuestion(@RequestBody Quiz q) {
        return quizRep.save(q);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping(value="/delete")
    @ResponseBody
    public void deleteQuestion(@RequestBody Quiz q) {
        quizRep.delete(q);
        return;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping(value="/deletebyid")
    @ResponseBody
    public void deleteQuestionById(@RequestParam("id") Long id) {
         quizRep.removeById(id);
    }

}