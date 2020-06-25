package com.class4;

public class NestedIfCondition2 {

	public static void main(String[] args) {
		/*
		 * Declare variable for gpa and having a diploma
		 * If user have a diploma --> Congratulation --> if gpa is higher 3.5 --> hire person
		 * otherwise do not hire.
		 */
		
		double gpa=3.6;
		double expectedGpa=3.5;
		boolean hasDiploma=false;
		
		if (hasDiploma) {
			System.out.println("Congratulation");
			if (gpa>expectedGpa) {
				System.out.println("You are hired");
			}else {
				System.out.println("Unfortunately we cannot hire you");
			}
		}else {
			System.out.println("Please get your degree");
		}

	}

}
