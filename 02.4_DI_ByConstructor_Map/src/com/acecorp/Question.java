package com.acecorp;

import java.util.Map;

public class Question {
	private int id;
	private String question;
	private Map<Integer, String> answer;
	
	public Question(int id, String question, Map<Integer, String> answer) {
		this.id = id;
		this.question = question;
		this.answer = answer;
	}

	public void displayInfo() {
		System.out.println(id+". "+question);
		System.out.println("Answers are:");
		for(Map.Entry<Integer, String> entry : answer.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
