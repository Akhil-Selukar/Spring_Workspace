package com.acecorp.dao;

import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import com.acecorp.Employee;

public class EmployeeDao {
	private SimpleJdbcTemplate template;

	public EmployeeDao(SimpleJdbcTemplate template) {
		this.template = template;
	}
	
	public int update(Employee e) {
		String query = "insert into employee values(?,?,?)";
		return template.update(query, e.getId(), e.getName(), e.getSalary());
	}		
}
