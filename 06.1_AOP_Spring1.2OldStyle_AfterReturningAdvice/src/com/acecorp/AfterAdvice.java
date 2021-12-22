package com.acecorp;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("Called afterReturning() method in AfterAdvice call");
		/*
		 * here as well we can add any logic that need to be executed after the method return some value.
		 */
	}
	
}
