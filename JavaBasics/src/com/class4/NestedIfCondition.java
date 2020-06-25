package com.class4;

public class NestedIfCondition {
	/*
	 * Write a program to check work eligibility
	 * If user is younger than <16 --> not allowed to work
	 * otherwise --> allowed to work. If user is younger than 64--> go to work
	 * otherwise --> enjoy your life
	 */
public static void main(String[] args) {
	
	int age=66;
	int eligibleAge=16;
	int retirementAge=64;
	
	if (age<eligibleAge) {
		System.out.println("You are too young, no work for you");
	}else {
		System.out.println("You are eligible to work");
		if (age<retirementAge) {
			System.out.println("Go work hard");
		}else {
			System.out.println("Enjoy your life");
		}
		
	}
}
}
