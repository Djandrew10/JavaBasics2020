package com.syntax.class04;

import java.util.Scanner;

public class Homework22 {

	public static void main(String[] args) {
		//Write a program to take user name, age and mobile number
        //First Output: "Enter your name"
        //Second Output: "Enter your mobile number" (please use xxx-xxx-xxxx format)
        //Third Output: "Enter your age"
	
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter your name");
	    String name = scan.nextLine();
	    System.out.println("Enter your mobile number");
	    String num = scan.nextLine();
	    System.out.println("Enter your age");
	    int age = scan.nextInt();
	    System.out.println("My name is " +name+ ", my age is " +age+ " and my mobile number is " +num);
}}