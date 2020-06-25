package com.syntax.class02;

public class TaskVariables {

	public static void main(String[] args) {
		// 1. Create a Java program and name it TaskVariables
		/*
		 * a. In your program create different type of variables to store student's
		 * information and then print value of those variables: name lastName grade city
		 * state phoneNumber
		 */

		String name = "Adrian";
		String lastName = "Cristian";
		char grade = 'A';
		String city = "Chisinau";
		String state = "Codru";
		long phoneNumber = 9297771761L;

		System.out.println(name);
		System.out.println(lastName);
		System.out.println(grade);
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);
		System.out.println("____________________________");
		

		/*
		 * b. Change student's city, state, phone number and grade. Print those updated
		 * values.
		 */

		city = "Washington";
		state = "District of Colombia";
		phoneNumber = 2027771761L;
		grade = 'B';

		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);
		System.out.println(grade);

	}

}
