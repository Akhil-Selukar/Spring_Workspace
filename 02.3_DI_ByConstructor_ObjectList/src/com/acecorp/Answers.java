package com.acecorp;

public class Answers {
	private int ansNo;
	private String ans;
	
	public Answers(int ansNo, String ans) {
		super();
		this.ansNo = ansNo;
		this.ans = ans;
	}
	
	public int getAnsNo() {
		return ansNo;
	}
	public void setAnsNo(int ansNo) {
		this.ansNo = ansNo;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}

	@Override
	public String toString() {
		return ansNo+". "+ans;
	}
	
	
}
