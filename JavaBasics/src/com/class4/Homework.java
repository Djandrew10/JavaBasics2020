package com.class4;

import java.util.Scanner;

public class Homework {
  /*
   * 5.5 Create a program that will take a boolean value from a user make the variable isTrue.
   * if the input is True or False then the output should read.
   * Output: "Input the boolean value"
   * Output: "The value is __"
   */
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter boolean value");
		boolean isTrue=scan.hasNextBoolean();
		System.out.println("The value is "+isTrue);
	
		int num1=23;
		int num2=24;
		
		if (num1>num2) {
			System.out.println("num1 is larger than num2");
		}else {
			System.out.println("Num1 is smaller than num2");
		}
	}
}
