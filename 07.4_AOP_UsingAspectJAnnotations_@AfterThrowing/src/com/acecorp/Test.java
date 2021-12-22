package com.acecorp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		Operation e = (Operation) context.getBean("opBean");
		
		System.out.println("Calling Validate...");
		try {
			e.validate(19);
		}catch(Exception ex) {
			System.out.println(ex);
		}
		System.out.println("Calling Validate AGAIN...!!");
		try {
			e.validate(11);
		}catch(Exception ex) {
			System.out.println(ex);
		}
	}
}
