package com.syntax.class02;

public class StringTask1 {
	public static void main(String [] args) {
		//String is a class that represents a group of characters.
		//To create a String we have to put values inside double quotes ""
		
		String str1 = "Good morning";
		String str2 = "Good  morning";
		
		String str3; //declaring a variable
		
		str3 = "Hi there"; //assign a value or initialize a variable
		str3 = "Bye"; //re-assigning a value
		str3 = "I am " + "learning Java";
		
		System.out.println(str1 + ". " + str3);  //Good morning. I am learning Java
	}

}
