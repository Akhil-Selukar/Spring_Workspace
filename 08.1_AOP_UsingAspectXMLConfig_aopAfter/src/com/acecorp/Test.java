package com.acecorp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Operation op = ctx.getBean("opBean", Operation.class);
		
		System.out.println("Calling msg()");
		op.msg();
		System.out.println("Calling m()");
		op.m();
		System.out.println("Calling k()");
		op.k();
	}

}
