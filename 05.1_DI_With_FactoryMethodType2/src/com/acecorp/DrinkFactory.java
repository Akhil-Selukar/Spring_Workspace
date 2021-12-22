package com.acecorp;

public class DrinkFactory {
	public static Drinks serveDrink() {
		/*
		 * based on some business logic here we can return both
		 * new Sprite() and new Pepsi() as both implements Drinks interface.
		 */
//		return new Sprite();
		return new Pepsi();
	}
}
