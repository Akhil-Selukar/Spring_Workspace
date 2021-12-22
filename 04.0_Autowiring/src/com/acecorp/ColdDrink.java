package com.acecorp;

public class ColdDrink {
	private Ice ice;
	
	public ColdDrink() {
		System.out.println("Inside ColdDring constructor.");
		System.out.println("ColdDrink object is created.");
	}
	
	public Ice getIce() {
		return ice;
	}
	public void setIce(Ice ice) {
		this.ice = ice;
	}

	public void display() {
		System.out.println("Called display() in ColdDrink.class");
	}
	
	public void displayAll() {
		System.out.println("\nCalling display methods from displayAll() method of ColdDrink.class");
		display();
		ice.display();
	}
}
