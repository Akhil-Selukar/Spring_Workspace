package com.acecorp;

public class Employee {
	private int id;
	private String name;
	private Address address;
	
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	public void showInfo() {
		System.out.println("Employee details are as follows:");
		System.out.println("Employee id : "+id);
		System.out.println("Employee name : "+name);
		System.out.println("Employee Address : "+address);
	}
}
