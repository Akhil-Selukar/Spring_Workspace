package com.acecorp;

public class Operation {
	public void validate(int age) {
		if(age < 18) {
			throw new ArithmeticException("Age is not valid!!");
		}else {
			System.out.println("Welcome to the party..");
		}
	}
}
