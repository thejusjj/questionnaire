package com.thejusjj.questionnaire.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.thejusjj.questionnaire.model.Question;

public interface QuestionnaireRepository extends MongoRepository<Question,String>{	
	public List<Question> findByText(String text);
}
