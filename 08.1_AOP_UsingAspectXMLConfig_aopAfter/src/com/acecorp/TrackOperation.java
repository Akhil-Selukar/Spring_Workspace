package com.acecorp;

import org.aspectj.lang.JoinPoint;

public class TrackOperation {
	public void myAdvice(JoinPoint jp) {
		System.out.println("Additional concerns..");
		System.out.println("Method signature : "+jp.getSignature());
	}
}
