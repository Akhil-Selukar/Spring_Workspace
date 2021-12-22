package com.acecorp;

public class Employee {
	private int id;
	private String name;
	private String city;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public void showInfo() {
		System.out.println("Employee details are as follows:");
		System.out.println("Employee id : "+id);
		System.out.println("Employee name : "+name);
		System.out.println("Employee city : "+city);
	}
}
