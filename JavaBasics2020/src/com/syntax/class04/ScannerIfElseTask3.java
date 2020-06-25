package com.syntax.class04;

import java.util.Scanner;

public class ScannerIfElseTask3 {
	public static void main(String [] args) {
		//3. Create a Java program that will ask user to input city and temperature.
				//Your program should convert Fahrenheit into Celsius and print
				//"The temperature in the city ___ is ____".
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your city?");
		String city = scanner.next();
		System.out.println("Please enter the temperature in Fahrenheit");
		int tempF = scanner.nextInt();
		int tempC = (tempF - 32) * 5 / 9;
		System.out.println("The temperature in Celsius of the city " +city+ " is " +tempC);
		
		
		//casting:
		//int * double = double
		int tempC2 = (int) ((tempF - 32) * (5.0 / 9.0));
		System.out.println("The temperature in Celsius of the city " +city+ " is " +tempC2);
			
}}