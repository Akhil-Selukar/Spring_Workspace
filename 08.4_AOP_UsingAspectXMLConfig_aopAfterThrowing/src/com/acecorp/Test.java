package com.acecorp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		Operation op = (Operation) context.getBean("opBean");
		
		System.out.println("Calling validate() with age 10..");
		try {
			op.validate(10);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Calling validate() again with age 19");
		try {
			op.validate(19);
		} catch (Exception e) {
			System.out.println(e);			
		}
	}
}
