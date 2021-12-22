package com.acecorp.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

import com.acecorp.Employee;

public class EmployeeDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public Boolean saveEmployeeByPreparedStatement(Employee e) {
		String query = "insert into employee values (?,?,?)";
		return jdbcTemplate.execute(query, new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setInt(1, e.getId());
				ps.setString(2, e.getName());
				ps.setDouble(3, e.getSalary());
				System.out.println("==>> Statement prepared : "+ps);
				return ps.execute();
			}
			
		});
	}
	
	public Boolean updateEmployeeByPreparedStatement(int id, String name, double salary) {
		String query = "update employee set name = ?, salary = ? where id = ?";
		
		return jdbcTemplate.execute(query, new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setInt(3, id);
				ps.setString(1, name);
				ps.setDouble(2, salary);
				System.out.println("==>> Statement prepared : "+ps);
				return ps.execute();
			}
			
		});
	}
}
