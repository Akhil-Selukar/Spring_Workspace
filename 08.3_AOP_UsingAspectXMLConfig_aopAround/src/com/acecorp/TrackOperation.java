package com.acecorp;

import org.aspectj.lang.ProceedingJoinPoint;

public class TrackOperation {
	public Object myAdvice(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Additional Concerns before bsiness logic..");
		Object obj = pjp.proceed();
		System.out.println("Additional concerns after business logic..");
		return obj;
	}
}
