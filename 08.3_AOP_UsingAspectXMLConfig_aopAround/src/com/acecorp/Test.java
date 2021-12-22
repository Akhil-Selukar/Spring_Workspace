package com.acecorp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		Operation e = (Operation) context.getBean("opBean");
		
		System.out.println("Calling m()");
		System.out.println("Printing result of m() from main : "+e.m());
		System.out.println("Calling k()");
		System.out.println("Printing result of k() from main : "+e.k());
	}
}
