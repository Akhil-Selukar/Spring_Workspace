package com.acecorp;

public class Address {
	private String city;
	private int zipCode;
	
	public Address(String city, int zipCode) {
		this.city = city;
		this.zipCode = zipCode;
	}

	//As we will be doing DI using constructor hence setter methods are not compulsory

	@Override
	public String toString() {
		return "Address [city=" + city + ", zipCode=" + zipCode + "]";
	}
	
}
