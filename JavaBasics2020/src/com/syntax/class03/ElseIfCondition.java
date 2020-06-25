package com.syntax.class03;

public class ElseIfCondition {

	public static void main(String[] args) {
		double num1 = 10.7;
		double num2 = 10.7;
		
		if (num1 > num2) {
			System.out.println("Number 1 is larger than Number 2");
		}else if (num1 < num2) {
			System.out.println("Number 1 is smaller than Number 2");
		}else {
			System.out.println("Numbers are equal");
		}
		
		System.out.println("We are done");
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		///ElseIfConditionTask1
		
		int day = 9;
		if (day==1) {
			System.out.println("Monday");
		}else if (day==2){
			System.out.println("Tuesday");
		}else if (day==3) {
			System.out.println("Wednesday");
		}else if (day==4) {
			System.out.println("Thursday");
		}else if (day==5) {
			System.out.println("Friday");
		}else if (day==6) {
			System.out.println("Saturday");
		}else if (day==7) {
			System.out.println("Sunday");
		}else {
			System.out.println("The day is not correct");
		}
		System.out.println("End of program  ");

		
		//TASK2
		//a. Create a Java program and declare int variable that will hold a month.
		//   Based on the value of the variable your program should print the name of the month.
		
		
		int month = 10;
		if (month ==1) {
			System.out.println("January");
		}else if (month ==2) {
		System.out.println("February");
	    }else if (month ==3) {
		System.out.println("March");
		}else if (month ==4) {
			System.out.println("April");
		}else if (month ==5) {
			System.out.println("May");
		}else if (month ==6) {
			System.out.println("June");
		}else if (month ==7) {
			System.out.println("July");
		}else if (month ==8) {
			System.out.println("August");
		}else if (month ==9) {
			System.out.println("September");
		}else if (month ==10) {
			System.out.println("October");
		}else if (month ==11) {
			System.out.println("November");
		}else if (month ==12) {
			System.out.println("December");
		}else {
			System.out.println("None of the above");
		}
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		//b. Write a program to check wheather number is positive or negative
		//c. Interview Question
		
//1st way
		
//	    int num = 0;
//       if (num > 0) {
//          System.out.println("Number is positive!");
//        }else if (num <0) {
//	        System.out.println("Number is negative!");
//        }else {
//          System.out.println("Number is zero!");
//2nd way
		
		int num = 0;
		if (num > 0) {
			System.out.println("Number is positive!");
		}else if (num ==0) {
			System.out.println("Number is zero!");
		}else {
			System.out.println("Number is negative!");
		}
//Both ways are acceptable
		
		//3. Write a java program to check wheather number is Even or Odd.
		int num3 = 67;
		int remeinder = num3 % 2;
		if (remeinder == 0) {
			System.out.println(num3 + " is even!");
		}else {
			System.out.println(num3 + " is odd!");
			
			//doubles and floats cannot be even or odds
		}

	}}
 

	
	
