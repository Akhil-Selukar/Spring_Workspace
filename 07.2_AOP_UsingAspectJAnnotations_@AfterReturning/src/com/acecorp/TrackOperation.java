package com.acecorp;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class TrackOperation {

	@AfterReturning(pointcut = "execution(* Operation.*(..))", returning = "result" )
	public void myAdvice(JoinPoint jp, Object result) {
		System.out.println("Additional Concerns.!!");
		System.out.println("Method Signature : "+jp.getSignature());
		System.out.println("Result Advice : "+ result);
		System.out.println("End of AfterReturning advice.");
	}
	
}
