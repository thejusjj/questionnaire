package com.thejusjj.questionnaire;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.thejusjj.questionnaire.model.Question;
import com.thejusjj.questionnaire.repository.QuestionnaireRepository;

@SpringBootApplication
public class QuestionnaireApplication {

	@Autowired
	QuestionnaireRepository questionnaireRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(QuestionnaireApplication.class, args);
	}

 
//	@Bean
//	CommandLineRunner runner(){
//		return args -> {
// 
////			System.out.print("<<<<<<<<<<<<<Cleaning MongoDatabase>>>>>>>>>>>>>>");
////			questionnaireRepository.deleteAll();
//// 
////			for(int i=0;i<5;i++){
////				Question user=	questionnaireRepository.save(new Question("Test"));
//// 
////				System.out.println("<<<<<<<<<<<<<Adding User >>>>>>>>>>>>>>");
////				System.out.println("***"+user.toString()+"***");
////			}
// 
//			System.out.println("<<<<<<<<<<<<<Get All  User >>>>>>>>>>>>>>");
//			List<Question> alluser=questionnaireRepository.findAll();
//			alluser.forEach(item -> System.out.println(item));
// 
//			alluser.clear();
// 
////			System.out.println("<<<<<<<<<<<<<Find User By Name >>>>>>>>>>>>>>");
////		    alluser=questionnaireRepository.findByText("Test");
////			alluser.forEach(item -> System.out.println(item));
//// 
////			System.out.println("Executed");
// 
//		};
//	}
}
