package com.acecorp;

import java.util.Map;

public class Question {
	private int id;
	private String que;
	private Map<String, User> answers;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQue() {
		return que;
	}
	public void setQue(String que) {
		this.que = que;
	}
	public Map<String, User> getAnswers() {
		return answers;
	}
	public void setAnswers(Map<String, User> answers) {
		this.answers = answers;
	}
	
	public void showInfo() {
		System.out.println(id+". "+que);
		for(Map.Entry<String, User> entry:answers.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println("\t- "+entry.getValue());
		}
	}
	
}
