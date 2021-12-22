package com.acecorp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.acecorp.dao.EmployeeDao;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmployeeDao emp = ctx.getBean("empdao", EmployeeDao.class);
		
		/*
		 * Code for adding new employee
		 */
//		int status = emp.saveEmployee(new Employee(03, "Snehal", 12345.854));
//		if(status == 1) {
//			System.out.println("Employee added successfully!!");
//		}else {
//			System.out.println("Something went wrong!");
//		}
		
		/*
		 * Updating existing employee.
		 */
//		int status = emp.updateEmployee(new Employee(03, "Anamika", 12345.895));
//		if(status == 1) {
//			System.out.println("Employee updated successfully!!");
//		}else {
//			System.out.println("Something went wrong!");
//		}
		
		/*
		 * Deleting existing employee.
		 */
		int status = emp.deleteEmployee(3);
		if(status == 1) {
			System.out.println("Employee deleted successfully!!");
		}else {
			System.out.println("Something went wrong!");
		}
	}

}
