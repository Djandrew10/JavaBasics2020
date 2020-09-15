package com.syntax.class15;

public class Task1 {

	public static void main(String[] args) {
		System.out.println("-----------------Task 2-----------------");
		//Create a String that should be combination of letters, numbers and special characters.
		//Find out how many alpha characters are there in the String.
		
		String str = "fghjttre 456789 69&*$%###!!@";
		
		str = str.replaceAll("[^A-Za-z]", "");
		System.out.println(str.length());
		
		System.out.println("-----------------Task 3----------------------");
		//You have  a String a="Is it Saturday? Is it raining? Do we have a Java Class today?"
		//How would you find out how many tentences are in that String?
		
		
		String a = "Is it Saturday? Is it raining? Do we have a Java Class today?";
		String[] array = a.split("[?]");
		
		//or if --> String a = "1.It is Saturday 2.It is raining 3.We have a Java class today";
		//String[] array = a.split("[0-9]");
		
		int sentences = array.length;
		
		System.out.println("Total numbers of sentences is " + sentences);

	}

}
