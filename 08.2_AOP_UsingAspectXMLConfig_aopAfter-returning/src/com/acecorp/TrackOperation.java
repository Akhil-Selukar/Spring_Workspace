package com.acecorp;

import org.aspectj.lang.JoinPoint;

public class TrackOperation {
	public void myAdvice(JoinPoint jp, Object result) {
		System.out.println("Additional Concerns..");
		System.out.println("Method signature : "+jp.getSignature());
		System.out.println("Printing result in advice : "+result);
		System.out.println("End of advice.");
	}
}
