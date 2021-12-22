package com.acecorp;

public class Employee {
	private int id;
	private String name;
	private Address address; //Aggregation or HAS-A relationship
	
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}


	public void showInfo() {
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Address : "+address.toString());
	}
}
