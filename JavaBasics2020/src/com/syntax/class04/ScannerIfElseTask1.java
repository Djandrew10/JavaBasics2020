package com.syntax.class04;

import java.util.Scanner;

public class ScannerIfElseTask1 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner (System.in);
		//1. You are a loan specialist and you need to ask user what is the amount of loan is needed.
		//If loan is less or equal to 200,000 then you would lend the money
		//otherwise you would reject the client.
		
		System.out.println("What is the amount of loan you need it?");
		int num1 = scanner.nextInt();
		System.out.println("The amount of loan you need it is " +num1);
		
		if (num1 <= 200000) {
			System.out.println("I will lend you the money!");
		}else{
			System.out.println("I will reject you!");
		}
		
	}

}
