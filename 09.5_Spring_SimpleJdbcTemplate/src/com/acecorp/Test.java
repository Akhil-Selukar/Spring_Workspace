package com.acecorp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.acecorp.dao.EmployeeDao;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmployeeDao emp = ctx.getBean("empdao", EmployeeDao.class);
		
		int res = emp.update(new Employee(06,"Karishma",14524.198));
		
		if(res == 1) {
			System.out.println("Employee added successfully!");
		}else {
			System.out.println("Something went wrong!");
		}
	}
}
