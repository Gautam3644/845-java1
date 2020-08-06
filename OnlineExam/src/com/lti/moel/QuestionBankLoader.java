package com.lti.moel;

import java.util.ArrayList;
import java.util.List;


import com.lti.moel.Question.Difficulty;

public class QuestionBankLoader {
	
	public List<Question> loadQuestionsOnJava() {
		String subjectName = "Java";
		
		QuestionBank qb = new QuestionBank();
		qb.addNewSubject(subjectName);
		
		Question q = new Question("What is Java?", Difficulty.EASY);
		List<Option> ops = new ArrayList<Option>();
		ops.add(new Option("Database", false));
		ops.add(new Option("PL", true));
		ops.add(new Option("OS", false));
		ops.add(new Option("FS", false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
		q = new Question("What is G1?", Difficulty.EASY);
		ops = new ArrayList<Option>();
		ops.add(new Option("Garbage Collector", true));
		ops.add(new Option("Jeevan", false));
		ops.add(new Option("Protein", false));
		ops.add(new Option("Organ", false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
		q = new Question("What is OOPS?", Difficulty.EASY);
		ops = new ArrayList<Option>();
		ops.add(new Option("Programming Concept", true));
		ops.add(new Option("SOCIAL MEDIA PTF", false));
		ops.add(new Option("Mistake", false));
		ops.add(new Option("Theory", false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
		
		q = new Question("What is HTML?", Difficulty.EASY);
		ops = new ArrayList<Option>();
		ops.add(new Option("Markup language", true));
		ops.add(new Option("Feature of search enginr", false));
		ops.add(new Option("instrument", false));
		ops.add(new Option("device", false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
		
		return qb.getQuestionsFor(subjectName);
	}

}
