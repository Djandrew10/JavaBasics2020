package com.syntax.class04;

import java.util.Scanner;

public class ScannerIfElseTask4 {

	public static void main(String[] args) {

		// Create a Java program that will ask if user has a credit card or not.
		// If the user does not have a credit card then offer them. If they do have one
		// ask what is the balance on the card?
		// If the balance on the card is larger than 1000, tell them to pay off
		// immediatelly
		// otherwise you can tell them that they can spend more.

		Scanner scan = new Scanner(System.in);

		boolean ccard;
		System.out.println("Do you have a credit card (true or false)?");
		ccard = scan.nextBoolean();

		if (ccard) {
			System.out.println("What is your Credit Card balance?");
			double balance = scan.nextDouble();
			if (balance >= 1000) {
				System.out.println("Please Pay off immediately!");
			} else {
				System.out.println("You can spend more!");
			}
		} else {
			System.out.println("Let me offer you our best Credit Card!");
		}

	}

}
