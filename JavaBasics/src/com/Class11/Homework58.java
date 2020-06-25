package com.Class11;

import java.util.Scanner;

public class Homework58 {

	public static void main(String[] args) {
		/*
		 * Create an int array with the size of 5 and input values with Scanner.  
		 * Print out each element of the array multiplied by ten, one element per line. 
		 * Create a loop and enter values into one loop, the second loop 
		 * print the values and it must be multiplied by 10. 
		 * */

		int [] num = new int[5];
		Scanner scanner=new Scanner(System.in);
		System.out.println("Input: ");	
		for(int i=0; i<num.length; i++) {
			
			System.out.println(num[i]=scanner.nextInt());
		}
		
		System.out.println("Output: ");
		for(int j=0; j<num.length; j++) {
			System.out.println(num[j]*10);
		}
		
	
	}
}
