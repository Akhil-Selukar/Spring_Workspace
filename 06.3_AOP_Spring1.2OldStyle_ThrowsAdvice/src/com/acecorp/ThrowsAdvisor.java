package com.acecorp;

import org.springframework.aop.ThrowsAdvice;

public class ThrowsAdvisor implements ThrowsAdvice {
	public void afterThrowing(Exception e) {
		System.out.println("Additional code to be executed when exception occutres.");
	}
}
