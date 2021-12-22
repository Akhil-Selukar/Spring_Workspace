package com.acecorp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.acecorp.model.Employee;

public class EmployeeDao {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int save(Employee emp) {
		
		String sql = "insert into employee(id, name, salary) values('"+emp.getId()+"','"+emp.getName()+"','"+emp.getSalary()+"');";
		return template.update(sql);
	}

	public int update(Employee emp) {
		
		String sql = "update employee set name='"+emp.getName()+"', salary='"+emp.getSalary()+"' where id='"+emp.getId()+"';";	
		return template.update(sql);
	}

	public int delete(int id) {
		
		String sql = "delete from employee where id='"+id+"';";	
		return template.update(sql);
	}
	
	public List<Employee> getEmployees() {
		
		return template.query("select * from employee",new RowMapper<Employee>(){    
	        public Employee mapRow(ResultSet rs, int row) throws SQLException {    
	            Employee e=new Employee();    
	            e.setId(rs.getInt(1));    
	            e.setName(rs.getString(2));    
	            e.setSalary(rs.getInt(3));    
	            return e;    
	        }    
	    });
	}

	public Employee getEmployeeById(int id) {
		
		String sql = "select * from employee where id=?;";
		return template.queryForObject(sql,new Object[] {id}, new BeanPropertyRowMapper<Employee>(Employee.class));
	}

}
