package com.Class12;

public class StringManipulations {

	public static void main(String[] args) {
		
		String str="Syntax";
		int lengthOfString=str.length();
		System.out.println(lengthOfString);
		
		String str1="Syntax Technologies";
		int lengthOfString1=str1.length();
		System.out.println(lengthOfString1);
		
		String str2="Welcome, students!";
		System.out.println(str2.length());
		
		String str3="Hello";
		
		String newString=str3.toUpperCase();
		System.out.println(newString);
		
		String LowerCaseString=newString.toLowerCase();
		System.out.println(LowerCaseString);
		
		//equals() - compares 2 strings, if strings are equal-->true, else--->false
		String str4="Hello";
		String str5="hello";
		
		boolean equality=str4.contentEquals(str5);
		System.out.println(equality);
		
		//equalsIgnoreCase() - compares 2 strings but ignores case
		String expectedBrowser="chrome";
		String actualBrowser="CHROME";
		
		boolean equals=expectedBrowser.equalsIgnoreCase(actualBrowser);
		System.out.println(equals);
		
		

	}

}
