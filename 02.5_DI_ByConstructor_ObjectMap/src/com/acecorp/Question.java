package com.acecorp;

import java.util.Map;

public class Question {
	private int id;
	private String question;
	private Map<Answer, User> answer;
	
	public Question(int id, String question, Map<Answer, User> answer) {
		this.id = id;
		this.question = question;
		this.answer = answer;
	}
	
	public void displayInfo() {
		System.out.println(id+". "+question);
		System.out.println("\nAnswers are as follow:\n");
		for(Map.Entry<Answer, User> entry : answer.entrySet()) {
			System.out.println(entry.getKey()+"\n\t- "+entry.getValue());
		}
	}
	
}
