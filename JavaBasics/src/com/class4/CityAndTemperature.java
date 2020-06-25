package com.class4;

import java.util.Scanner;

public class CityAndTemperature {
	public static void main(String[] args) {
		/*
		 * ask user to enter city and temperature in Fahrenheit Your program should
		 * convert F-->C Your program should say "The temperature in the city __ is __"
		 */

		String cityName;
		int temp;

		Scanner myScanner = new Scanner(System.in);
		System.out.println("Please enter your city");

		cityName = myScanner.next();
		System.out.println("Please enter the temperature in Fahrenheit");

		temp = myScanner.nextInt();

		// formula (F - 32) x5/9;

		int convertedTemp = (temp - 32) * 5 / 9;
		System.out.println("the temperature in the city " + cityName + " is " + convertedTemp+"C");

	}
}
