package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		int a = 65;
		String s = "bla";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please write some text and press enter!");
		String text = scan.nextLine();
		System.out.println("_________________________");
		System.out.println(text);
		
		//int a = (int) "three"; ----> Compile time error
		//int b = 33.4; -------------> Compile time error
		
		
		//Let me read an integer
		System.out.println("Enter age!!!");
		int age = scan.nextInt();  //If not a integer ----> Run time error
		System.out.println("The age that you entered is " +age);
	}

}
