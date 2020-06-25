package com.syntax.class04;

import java.util.Scanner;

public class ScannerIfElseTask2 {
	public static void main(String [] args) {
		//2. You are DMV representative and you need to ask customer their age.
				//If they are 18 and older you will issue a driver licence to them
				//otherwise you will offer them to get a learners permit.
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your age?");
		int age = scanner.nextInt();
		
		if (age >= 18) {
			System.out.println("I am issuing a driver licence to you");
		}else {
			System.out.println("You need to get a learners permit first!");
		}
	}

}
