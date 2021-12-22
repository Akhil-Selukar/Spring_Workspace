package com.acecorp;

import org.aspectj.lang.JoinPoint;

public class TrackOperation {
	public void myAdvice(JoinPoint jp, Throwable error) {
		System.out.println("Addition concerns..");
		System.out.println("Method signature : "+jp.getSignature());
		System.out.println("Exception is : "+error);
		System.out.println("End of advice..");
	}
}
