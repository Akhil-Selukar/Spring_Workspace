package com.acecorp;

import java.util.List;

public class Question {
	private int id;
	private String question;
	private List<String> answers;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	
	public void showInfo() {
		System.out.println(id+". "+question);
		for(String a:answers) {
			System.out.println(a);
		}
	}
}
