package com.acecorp;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperation {

	@Pointcut("execution(* Operation.*(..))")
	//@Pointcut("execution(* Operation.m*(..))") 
	//@Pointcut("execution(int Operation.*(..))") 
	public void pc1() {}
	
	@Pointcut("execution(* Operation.k*(..))")
	public void pc2() {}
	
	@After("pc1()")
	public void myAdvice(JoinPoint jp) {
		System.out.println("Additional Concerns.!!");
		System.out.println("Method Signature : "+jp.getSignature());
	}
	
	@After("pc2()")
	public void advice2(JoinPoint jp){
		System.out.println("\nExtra additional concerns..\n");
	}
	
}
