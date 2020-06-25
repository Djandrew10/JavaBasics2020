package com.syntax.class04;

import java.util.Scanner;

public class ScannerIfElse {
	public static void main(String [] args) {
		//ctrl +shift +o
		Scanner scan = new Scanner(System.in);
		
		//Ask the user to enter two numbers
		//Compare the number and print wich one is larger
		
	
		System.out.println("Please enter a number");
		int age1 = scan.nextInt();
		
		System.out.println("Please enter another number");
		int age2 = scan.nextInt();
		
		System.out.println("Numbers are " +age1 + " and " +age2);
		System.out.println("____________________________");
		
		if (age1 > age2) {
			System.out.println(age1 + " is larger than " +age2);
		}else if (age1 < age2) {
			System.out.println(age1 + " is smaller than " +age2);
		}else {
			System.out.println(age1 + " is equal to " +age2);
		}
		
	}

}
