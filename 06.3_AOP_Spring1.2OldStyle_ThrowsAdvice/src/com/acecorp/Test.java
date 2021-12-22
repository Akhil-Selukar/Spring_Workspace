package com.acecorp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Validator val = context.getBean("proxy", Validator.class);
		try {
			val.validate(10);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
