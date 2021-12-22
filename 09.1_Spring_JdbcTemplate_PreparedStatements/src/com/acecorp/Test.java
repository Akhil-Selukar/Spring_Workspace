package com.acecorp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.acecorp.dao.EmployeeDao;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmployeeDao emp = ctx.getBean("empdao", EmployeeDao.class);
		/*
		 * to add new employee.
		 */
		Boolean status = emp.saveEmployeeByPreparedStatement(new Employee(02, "Shrish", 21546.854));
		if(!status) {
			System.out.println("Employee added successfully!!");
		}else {
			System.out.println("Something went wrong!");
		}
		
		/*
		 * to update employee using id.
		 */
//		Boolean status1 = emp.updateEmployeeByPreparedStatement(3, "Dr. Sneha", 12356.125);
//		if(!status1) {
//			System.out.println("Employee updated successfully!!");
//		}else {
//			System.out.println("Something went wrong!");
//		}
	}
}
