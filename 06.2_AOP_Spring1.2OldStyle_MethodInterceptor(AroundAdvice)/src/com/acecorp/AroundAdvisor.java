package com.acecorp;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvisor implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation method) throws Throwable {
		
		Object obj;
		System.out.println("Additional concerns before actual logic.");
		obj=method.proceed();
		System.out.println("Additional concerns after actual logic.");
			
		return obj;
	}

}
