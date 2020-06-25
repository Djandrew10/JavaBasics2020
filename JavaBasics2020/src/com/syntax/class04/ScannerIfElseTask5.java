package com.syntax.class04;

import java.util.Scanner;

public class ScannerIfElseTask5 {

	public static void main(String[] args) {
		// Write a program to ask user to enter numbers of worked years and annual salary.
		// If user worked for more or equals to 5 years than user is eligible for the bonus,
		// otherwise he is not. Once user is eligible and salary is larger than 50000
		// than bonus = 5000, otherwise bonus=3000.

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number of worked years");
		int years = scan.nextInt();
		
		System.out.println("Please enter your annual salary");
		double salary = scan.nextDouble();
		
		if (years >= 5) {
			System.out.println("You are eligible for the bonus");
		
		if (salary >= 50000){
			System.out.println("You are getting an 5000$ bonus!");
		}else{
			System.out.println("You are getting an 3000$ bonus!");
		}
		}else{
			System.out.println("You are NOT eligible for the bonus");
		}
		
	}

}
