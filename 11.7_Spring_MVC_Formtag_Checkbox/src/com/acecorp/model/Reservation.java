package com.acecorp.model;

public class Reservation {

	private String firstName;
	private String lastName;
	private String gender;
	private String[] meal;
	
	public Reservation() {
		// TODO Auto-generated constructor stub
	}

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getMeal() {
		return meal;
	}

	public void setMeal(String[] meal) {
		this.meal = meal;
	}
	
}
