package com.acecorp;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperation {

	@Pointcut("execution(* Operation.*(..))")
	public void pc() {
		
	}
	
	@Around("pc()")
	public Object myAdvice(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("Additional Concerns Before Calling Actual Method..!!");
		Object obj = jp.proceed();
		System.out.println("Additional Concerns After Calling Actual Method..!!");
		
		return obj;
	}
	
}
