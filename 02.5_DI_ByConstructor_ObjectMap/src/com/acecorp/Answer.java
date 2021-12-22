package com.acecorp;

public class Answer {
	private int id;
	private String answer;
	
	public Answer(int id, String answer) {
		this.id = id;
		this.answer = answer;
	}

	@Override
	public String toString() {
		return id+". "+answer;
	}

}
