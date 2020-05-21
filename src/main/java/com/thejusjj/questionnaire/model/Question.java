package com.thejusjj.questionnaire.model;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "question")
public class Question {
	
	@Id
	private ObjectId id;
	private String text;
//	private List children;
	
	public Question() {}
	
	public Question(String text) {
		this.text = text;
	}
	
	public String getId() {
		return id.toString();
	}
	public void setId(String id) {
		this.id = new ObjectId(id);
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	
	
}
