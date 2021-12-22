package com.acecorp;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperation {

	//@Pointcut("execution(* Operation.*(..))")
	//@Pointcut("execution(* Operation.m*(..))") 
	@Pointcut("execution(int Operation.*(..))") 
	public void pc1() {}
	
	@Before("pc1()")
	public void myAdvice(JoinPoint jp) {
		System.out.println("Additional Concerns.!!");
		System.out.println("Method Signature : "+jp.getSignature());
	}
	
}
