package com.syntax.class04;

import java.util.Scanner;

public class ScannerClassExemples {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner (System.in);
		
		//String text1 = myScanner.next();  -------> print only first word
		//String text2 = myScanner.nextLine();  ---> print the whole line
		
		System.out.println("Please enter a integer!");
		int num = myScanner.nextInt();
		System.out.println(num);
		
		System.out.println("Please enter a double!");
		double d = myScanner.nextDouble();
		System.out.println(d);
		
		System.out.println("Please enter a boolean!");
		boolean b = myScanner.nextBoolean();
		System.out.println(b);
		
		System.out.println("Please enter a letter!");
		char myChar = myScanner.next().charAt(0);
		System.out.println(myChar);
		
		char myChar1 = myScanner.next().charAt(1);
		System.out.println(myChar1);
		
		char myChar2 = myScanner.next().charAt(2);
		System.out.println(myChar2);

	}

}
