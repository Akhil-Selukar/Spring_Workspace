package com.acecorp;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvisor implements MethodBeforeAdvice  {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("==>> Called before method() (logging)");
		System.out.println("==>> Method info \nMethod name : "+method.getName()+"\nMethod modifier : "+method.getModifiers());
		System.out.println("==>> Argfuments info");
		for(Object arg:args) {
			System.out.println(arg);
		}
		System.out.println("==>> Target object : "+target);
		System.out.println("==>> target object class name : "+target.getClass().getName());
	}

}
