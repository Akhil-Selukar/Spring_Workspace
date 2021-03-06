package com.acecorp.model;

import javax.validation.constraints.Size;

public class Employee {
	private String firstName;
	@Size(min = 2, message = "Required")
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
