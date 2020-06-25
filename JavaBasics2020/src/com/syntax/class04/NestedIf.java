package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		int age = 26;
		if (age <18) {
			System.out.println("You are teenager, please don't work");
		}else {
			System.out.println("You are older than 18");
		}
		if (age <64) {
			System.out.println("You are eligible to work");
		}else {
			System.out.println("Enjoy your life");
		}
		System.out.println("*****************************************");
		
		boolean isMorning = true;
		boolean isSchool = false;
		int time = 20; //8pm
		
		if (isMorning) {
			System.out.println("Good morning");
			if (isSchool) {
				System.out.println("Friends");
			}else {
				System.out.println("Family");
			}
			
			System.out.println("Bye");
		}else {
			System.out.println("It is not morning");
			if (time < 18) {
				System.out.println("Good afternoon!"); 
			}else {
				System.out.println("Good evening!");
			}
		}
		System.out.println("Vika has no questions");

	}

}
