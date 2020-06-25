package com.syntax.class02;

public class TaskStringConcatenation {

	public static void main(String[] args) {
		//1. My name is __ and my last name is ____.
		//2. I live in the city of __, state __ and my phone number is ___ !
		
		String name = "Adrian";
		String lastName = "Cristian";
		String city = "Washington";
		String state = "DC";
		String phoneNumber = "(929)-777-1761";
		
		System.out.println("My name is " + name + " and my last name is " + lastName + ".");
		System.out.println("I live in the city of " + city + ',' + " state " + state + " and my phone number is " + phoneNumber + "!" );

	}

}
