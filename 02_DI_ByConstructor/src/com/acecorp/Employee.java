package com.acecorp;

public class Employee {
	private int id;
	private String name;
	
	public Employee() {
		System.out.println("Default constructor");
	}
	
	public Employee(int id) {
		this.id = id;
	}
	
	public Employee(String name) {
		this.name = name;
	}
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
	}
}
