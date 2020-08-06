package com.lti.model;

import java.util.ArrayList;
import java.util.List;

import com.lti.model.Question.Difficulty;

public class QuestionBankLoader {
	
	public List<Question> loadQuestionOnJava() {
		String subjectName = "Java";
		QuestionBank qb = new QuestionBank();
		qb.addNewSubject(subjectName);
		
		Question q = new Question("What is Java?", Difficulty.EASY);
		List<Option> ops = new ArrayList<Option>();
		ops.add(new Option("Java is a Database", false));
		ops.add(new Option("Java is a Programming language", true));
		ops.add(new Option("Java is a OS", false));
		ops.add(new Option("Java is a File System", false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
		
		q = new Question("Which of the following option leads to the portability and security of Java?", Difficulty.MEDIUM);
		ops = new ArrayList<Option>();
		ops.add(new Option("The applet makes the Java code secure and portable", false));
		ops.add(new Option("Bytecode is executed by JVM", true));
		ops.add(new Option("Dynamic binding between objects", false));
		ops.add(new Option("Use of exception handling", false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
		
		q = new Question("Which of the following is not a Java features?", Difficulty.MEDIUM);
		ops = new ArrayList<Option>();
		ops.add(new Option("Dynamic", false));
		ops.add(new Option("Use of pointers", true));
		ops.add(new Option("Architecture Neutral", false));
		ops.add(new Option("Object-oriented", false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
		q = new Question("In character stream I/O, a single read/write operation performs", Difficulty.MEDIUM);
		ops = new ArrayList<Option>();
		ops.add(new Option("Two bytes read/write at a time", true));
		ops.add(new Option("Eight bytes read/write at a time.", false));
		ops.add(new Option("One byte read/write at a time.", false));
		ops.add(new Option("Five bytes read/ write at a time", false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
		
		
		return qb.getQuestionsFor(subjectName);
	}

}
