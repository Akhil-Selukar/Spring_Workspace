package com.acecorp;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.acecorp.dao.EmployeeDao;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmployeeDao emp = ctx.getBean("empdao", EmployeeDao.class);
		
		List<Employee> empList = emp.getAllEmployees();
		System.out.println("Details of all employees are as follows : ");
		for(Employee e:empList) {
			System.out.println(e);
		}
	}
}
