package com.acecorp;

import java.util.Map;

public class Question {
	private int id;
	private String que;
	private Map<Integer, String> answers;
	
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
	public Map<Integer, String> getAnswers() {
		return answers;
	}
	public void setAnswers(Map<Integer, String> answers) {
		this.answers = answers;
	}
	
	public void showInfo() {
		System.out.println(id+". "+que);
		System.out.println("Answers are : ");
		for(Map.Entry<Integer, String> entry:answers.entrySet()) {
			System.out.println(entry.getKey()+". "+entry.getValue());
		}
	}
}
