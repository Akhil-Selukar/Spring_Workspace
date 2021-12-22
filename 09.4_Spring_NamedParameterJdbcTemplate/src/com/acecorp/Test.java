package com.acecorp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.acecorp.dao.EmployeeDao;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmployeeDao emp = ctx.getBean("empdao", EmployeeDao.class);
		
		emp.addEmployee(new Employee(05,"kaustubh",12345.12 ));
	}
}
