package com.acecorp;

public class ColdDrink {
	private static final ColdDrink drink = new ColdDrink(); // Creation of object
	
	private ColdDrink() { // private constructor
	}
	
	public static ColdDrink coldDrinkFactory() {  // factory method
		System.out.println("Inside factory method.");
		return drink;
	}
	
	public void display() {
		System.out.println("Inside display() method of ColdDrink class.");
	}
	
}
