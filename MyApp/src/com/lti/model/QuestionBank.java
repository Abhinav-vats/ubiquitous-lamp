package com.lti.model;
import java.util.*;


public class QuestionBank {
	
	private Map<String, List<Question>> questionBank = new HashMap<>();
	
	
	public void addNewSubject(String subject) {
		questionBank.put(subject, new  ArrayList<>());
	}
	
	public void addNewQuestion(String subjectName, Question question) {
		List<Question> questions =  questionBank.get(subjectName);
		questions.add(question);
	}
	
	public List<Question> getQuestionsFor(String subjectName){
		return questionBank.get(subjectName);
	}

}
