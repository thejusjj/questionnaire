package com.thejusjj.questionnaire.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thejusjj.questionnaire.model.Question;
import com.thejusjj.questionnaire.repository.QuestionnaireRepository;

@Controller
@RequestMapping("/question")
public class QuestionnaireController {
	
	@Autowired 
	QuestionnaireRepository questionnaireRepository;
	
	@GetMapping
	public @ResponseBody List<Question> getAllQuestions(){
		return questionnaireRepository.findAll();
	}
	
	@PostMapping
	public @ResponseBody Question createNewQuestion(@RequestBody Question question) {
		return questionnaireRepository.save(question);
	}

}
