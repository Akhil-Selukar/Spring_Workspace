package com.acecorp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		Operation e = (Operation) context.getBean("opBean");
		
		System.out.println("Calling msg..");
		e.msg();
		
		System.out.println("Calling m..");
		e.m();
		
		System.out.println("Calling k..");
		e.k();
	}

}
