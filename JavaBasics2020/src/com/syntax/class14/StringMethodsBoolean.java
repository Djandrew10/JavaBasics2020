package com.syntax.class14;

public class StringMethodsBoolean {
	public static void main(String[] args) {
		
		System.out.println("-------------- .contains() method ------------------");
		//checks if String contains another sequence of specified characters
		String str = "Good afternoon All";
		
		boolean contains = str.contains("afternoon");
		
		String searchValue = "good";
		
		boolean isItThere = str.contains(searchValue);
		System.out.println(isItThere);
		
		System.out.println(str.contains("A"));
		System.out.println(str.contains("after "));
		
		System.out.println("-------------- .startsWith() method ------------------");
		
		String drink = "Welcome students";
		boolean starts = drink.startsWith("Welcome");
		System.out.println(starts);
		
		//drink.startsWith('w'); CE: we need to check if it starts with specified String, cannot be just char
		
		System.out.println("-------------- .endsWith() method ------------------");
		boolean ends = drink.endsWith("a");
		System.out.println(ends);
		
		String str1 = "Hello Mohammed";
		String str2 = "Hello Bulat";
		
		System.out.println("String " + str1 + " " + str1.startsWith("Hello"));
		System.out.println(str2.endsWith("Bulat"));
		
		System.out.println("-------------- .equals() method ------------------");
		
		String string1 = "Saturday";
		String string2 = "saturday";
		
		boolean equality = string1.contentEquals(string2);
		System.out.println(equality);
		
		System.out.println("-------------- .equalsIgnoreCase() method ------------------");
		
		boolean equalityNoCase = string1.equalsIgnoreCase(str2);
		System.out.println(equalityNoCase);
		
		System.out.println("====Real Example====");
		String expected = "Password cannot be empty";
		String actual = "password cannot be empty";
		
		if (expected.contentEquals(actual)) {
			System.out.println("Test pass");
		}else {
			System.out.println("Test fail");
			
			System.out.println("======Real Example of equalsIgnoreCase=====");
			
			String expectedBrowser = "Chrome";
			
			if (expectedBrowser.equalsIgnoreCase("chrome")) {
				System.out.println("Test executed on chrome browser");
			}else {
				System.out.println("Test executed NOT on chrome browser  ");
			}
		}
		
	}

}
