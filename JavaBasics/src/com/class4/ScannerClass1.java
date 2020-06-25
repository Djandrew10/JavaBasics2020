package com.class4;

import java.util.Scanner;

public class ScannerClass1 {
	public static void main(String[] args) {
		// ask user for the name and print Good morning

		Scanner input = new Scanner(System.in);
		System.out.println("Pleaase enter your name");

		String name = input.nextLine();

		System.out.println("Good morning " + name);

		Scanner adrian = new Scanner(System.in);
		System.out.println("Please provide your age");

		String age = input.nextLine();
		System.out.println("You're " + age + " years old");
	}

}
