package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
		
		//Widening Casting, implicit, automatically
		double d = 7;
		System.out.println(d);
		
		// int i = 7.58;  //compile time error -->
		                 //Type mismatch: cannot convert from double to int
		int i = (int) 7.58;
		
		System.out.println(i);
		
		//Narrowing Casting, explicit, manually
		//narrowing a large number into a byte
		//explicitly doing it, manually
		byte b = (byte) 123865;
		System.out.println(b);
		
		long l1 = 45;
		long l2 = 23478654432l;
		
		//You are trying to fit something from the big box into a small box
		int number1 = (int) l1;
		System.out.println("number1 = "+number1);
		
		int number2 = (int) l2;
		System.out.println(number2);
		

		

	}

}
