package com.quiz.krishna.controller;

import com.quiz.krishna.model.Quiz;
import com.quiz.krishna.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.List;

@RequestMapping("/questions")
@RestController
public class QuizController {

    @Autowired
    QuizRepository quizRep;

    @RequestMapping("/")
    public String index() {
        return "Jai Shri Krishna";
    }

    @GetMapping(value="/forCategoryAndLevel")
    @ResponseBody
    public List<Quiz> getQuestionsForCategoryAndLevel(@RequestParam("category") String category,
                                                      @RequestParam("level") Integer level) {
        return quizRep.findQuizByCategoryAndAndLevel(category, level);
    }

    @GetMapping(value="/forTag")
    @ResponseBody
    public List<Quiz> getQuestionsForTag(@RequestParam("tag") String tag) {
        return quizRep.findQuizByTags(tag);
    }

}