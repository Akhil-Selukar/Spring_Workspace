package com.acecorp;

import java.util.List;

public class Question {
	private int id;
	private String que;
	private List<String> answers;
	
	public Question(int id, String que, List<String> answers) {
		this.id = id;
		this.que = que;
		this.answers = answers;
	}
	
	public void showInfo() {
		System.out.println(id+". "+que);
		System.out.println("\nAnswers are:");
		for(String s:answers) {
			System.out.println(s);
		}
	}
}