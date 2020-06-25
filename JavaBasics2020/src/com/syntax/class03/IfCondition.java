package com.syntax.class03;

public class IfCondition {
	public static void main(String[] args) {
		//Declare a number and compare if the number is larger than 100
		//If the number is larger than 100, i will print --> My number is large
		
		int num = 178;
		boolean result = num > 100;
		System.out.println("Let us check");
		if (num > 100) {
		System.out.println("My number is large");
		} else {
			System.out.println("My number is small");
		}
		System.out.println("The check is complete");
		/// boolean result = num > 100;
		/// if (result) {
		/// System.out.println("The result is true");
		/// }
	
		int num1 = 78;
		boolean result1 = num1 > 100;
		System.out.println("Let us check");
		if (num1 > 100) {
		System.out.println("My number is large");
		} else {
			System.out.println("My number is small");
		}
		System.out.println("The check is complete");
		System.out.println("*********************************");
		
		int expectedHours = 15;
		int actualHours = 20;
	if (actualHours >= expectedHours) {
		System.out.println("You will love Java");
	} else {
		System.out.println("You will not love Java");
	}
	System.out.println("*********************************");
	
	double budget = 10000;
	double carPrice = 15000;
	if (budget > carPrice) {
		System.out.print("I will buy this car. ");
		System.out.println("I am happy");
	} else {
		System.out.print("I will not buy this car. ");
		System.out.println("I will study Java");
		System.out.println("I will find a job");
		System.out.println("Then, i'll have the money");
	}
	
	}

}
