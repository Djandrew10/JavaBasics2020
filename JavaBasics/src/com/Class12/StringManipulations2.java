package com.Class12;

public class StringManipulations2 {

	public static void main(String[] args) {


		String str="Good morning, students!";
		boolean contains=str.contains("Students");
				System.out.println(contains);
				
		
				String present="Welcome, Adrian";
				String neededValue="WELCOME";
				
				boolean  flag=present.contains(neededValue);
				System.out.println(flag);
				
				boolean flag1=present.toUpperCase().contains(neededValue);
				
				String str1="Syntax";
				
				boolean starts=str1.startsWith("S");
				System.out.println(starts);
			
				System.out.println(str1.endsWith("y"));
				
				
				//isEmpty() if length of a string is =0---> string is empty else --->it is not
				System.out.println("______isEmpty()_________");
				String str2="";
				boolean isEmpty=str2.isEmpty();
				System.out.println(isEmpty);
				
				//concat() --> will concatinate 1 string to the end of another
				System.out.println("_______concat()_____");
				String str3="Hello";
				String str4="Ali!";
				
				System.out.println(str3+str4);
				System.out.println(str3.concat(str4));
				
				
				
				//Trim()----> will remove spaces at the begining and the end of your String
				System.out.println("_________--_________");
				String expected="You might qualify";
				String actual="  You might qualify  ";
				
				actual=actual.trim();
				System.out.println(expected.equals(actual));
				

	}

}
