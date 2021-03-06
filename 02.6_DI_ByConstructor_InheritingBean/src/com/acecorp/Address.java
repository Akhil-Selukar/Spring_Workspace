package com.acecorp;

public class Address {
	private String city;
	private int zipcode;

	public Address(String city, int zipcode) {
		this.city = city;
		this.zipcode = zipcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return city+", pin-code : "+zipcode;
	}
		
}
