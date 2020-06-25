package com.class4;

public class EvenOdd {

	public static void main(String[] args) {
		/*
		 * Write a Java Program to check whether number is Even or Odd.
		 */

		int mod = 23 % 2;

		System.out.println(mod);

		int num = 45;
		if (num % 2 == 0) {
			System.out.println(num + " is even number");
		} else {
			System.out.println(num + " is an odd number");

			/*
			 * Write a program to check whether number is positive or negative
			 * 
			 */
			int num1 = 33;
			if (num1 % 2 == 0) {
				System.out.println(num1 + " is positive number");
			} else {
				System.out.println(num1 + " is negative number");

				/*
				 * Write a program to check whether number is positive or negative
				 */
				int num2 = -31;
				if (num2 > 0) {
					System.out.println("Positive");
				} else if (num2 < 0) {
					System.out.println("Negative");
				} else {
					System.out.println("The value of num is equal to " + num2);
				}
			}
		}
	}

}
