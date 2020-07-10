package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		//We want to ask user's name 5 times and print Good Afternoon ___ 5 times
		Scanner scan = new Scanner(System.in);
		
		int num = 1;                             //While loop will run 5 times
		while (num <= 5) {
		System.out.println("Please enter your name:");
		String name = scan.nextLine();
		
		System.out.println("Good Afternoon " + name);
        num++;
		}
		
		System.out.println("_________________________________");
		int num2 = 1;                             // Do while will run 5 times
		 do {
		System.out.println("Please enter your name:");
		String name = scan.nextLine();
		
		System.out.println("Good Afternoon " + name);
        num2++;
		}while (num2 <= 5);
}
}