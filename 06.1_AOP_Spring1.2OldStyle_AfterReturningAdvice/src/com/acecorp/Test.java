package com.acecorp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Calculate calc = context.getBean("proxy", Calculate.class);
		System.out.println("The addition of given numbers is : "+calc.adder(10, 3));
	}

}
