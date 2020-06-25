package com.syntax.class02;

public class ArithmeticOperatorsTask1 {

	public static void main(String[] args) {
		//Write a Java program to add, subtract, multiply and divide 2 decimal values. 
		//Your program should say. "The _______ of 2 numbers ___ and ___ is equal to _____"
		
		float b1 = 6.6f,  b2 = 14.80f;
		float sum = b1 + b2;
		
		System.out.println(sum);
		System.out.println("The addition of 2 numbers " + b1 + " and " + b2 + " is equal to " + sum);
		System.out.println("______________");
		
		
		//or
		System.out.println("The addition of 2 numbers " + b1 + " and " + b2 + " is equal to " + (b1 + b2));
		System.out.println("______________");
		
		double c1 = 32.4444;
		double c2 = 68.999;
		double sub = c2 - c1;
		
		System.out.println(sub);
		System.out.println("The substraction of 2 numbers " + c2 + " substract " + c1 + " is equal to " + sub);
		System.out.println("_____________");
		
		float d1 = 10.5f, d2 = 42.6f;
		double mult = d1 * d2;
		
		System.out.println(mult);
		System.out.println("The multiplication of 2 numbers "+ d1 + " multiply to " + d2 + " is equal to "+ mult);
		System.out.println("______________");
		
		//or
		System.out.println("The multiplication of 2 numbers "+ d1 + " multiply to " + d2 + " is equal to "+ d1 * d2);
		System.out.println("______________");
		
		double e1 = 56.9999999;
		float  e2 = 6.8f;
		double div = e1 / e2;
		
		System.out.println(div);
		System.out.println("The division of 2 numbers " + e1 + " devide to " + e2 + " is equal to " + div);
		
		
		
		

	}

}
