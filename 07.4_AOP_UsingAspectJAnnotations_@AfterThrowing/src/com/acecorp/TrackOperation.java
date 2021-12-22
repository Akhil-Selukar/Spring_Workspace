package com.acecorp;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class TrackOperation {

	@AfterThrowing(pointcut = "execution(* Operation.*(..))", throwing = "error")
	public void myAdvice(JoinPoint jp, Throwable error) {
		System.out.println("Additional Concerns..!!");
		System.out.println("Method Signaturre : "+jp.getSignature());
		System.out.println("Exception is : "+error);
		System.out.println("End of throwing advice..!!");
	}
	
}
