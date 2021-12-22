package com.acecorp;

public class Validator {
	public void validate(int age) throws Exception {
		if(age < 18) {
			throw new ArithmeticException("You are not allowed!");
		}else {
			System.out.println("Welcome..!!");
		}
	}
}
