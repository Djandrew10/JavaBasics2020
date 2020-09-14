package com.syntax.class15;

public class Homework1 {
	public static void main(String[] args) {
		//Create a String and if the String is not empty perform the following:
		//If the String has an odd number of characters and has 3 or more characters,
		//print the character in the middle of the string.
		String str = "AAbAA";
		int size = str.length();  // 5
		if (!str.isEmpty()) {
		if (size >=3) {
			if (size % 2 !=0) {
				int print = (size /2);  // 5/2=2
				System.out.println(str.charAt(print));
			}else {
				System.out.println("This string has an even number of characters");
			}
		}else {
			System.out.println("This string has less than 3 characters");
		}
	}
  }
}
