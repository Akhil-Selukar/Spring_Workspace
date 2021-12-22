package com.acecorp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.acecorp.Employee;

public class EmployeeDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<Employee> getAllEmployees(){
		
		return jdbcTemplate.query("select * from employee;", new ResultSetExtractor<List<Employee>>() {

			@Override
			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
				
				List<Employee> empList = new ArrayList<Employee>();
				while(rs.next()) {
					Employee e = new Employee();
					e.setId(rs.getInt(1));
					e.setName(rs.getString(2));
					e.setSalary(rs.getDouble(3));
					empList.add(e);
				}
				return empList;
			}
		});
	}
}
