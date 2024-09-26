package com.firstspringapplication.QuizApp.controller;

import com.firstspringapplication.QuizApp.Question;
import com.firstspringapplication.QuizApp.service.QuestionService;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("question")
public class QuestionController {
	
	@Autowired
	QuestionService questionService;
	
	@GetMapping("allQuestions")
	public List<Question> getAllQuestions() {
		
		return questionService.getAllQuestions();
		
	}
}