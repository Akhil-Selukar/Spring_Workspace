package com.temp;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		
		for(int i = 1; i*i<b; i++) {

				System.out.println(i*i);

		}
	}

}



