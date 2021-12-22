package com.acecorp;

import java.util.List;

public class Question {
	private int id;
	private String que;
	private List<Answers> answers;
	
	public Question(int id, String que, List<Answers> answers) {
		this.id = id;
		this.que = que;
		this.answers = answers;
	}
	
	public void showInfo() {
		System.out.println(id+". "+que);
		System.out.println("\nAnswers are:");
		for(Answers a:answers) {
			System.out.println(a);
		}
	}
}