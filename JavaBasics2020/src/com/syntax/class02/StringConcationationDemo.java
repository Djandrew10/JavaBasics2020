package com.syntax.class02;

public class StringConcationationDemo {

	public static void main(String[] args) {
		String name = "Adrian";
		
		System.out.println("I love " + name);
		System.out.println("I love" + " " + name);
		
		//System.out.println("I love" + name); This is not correct
		
		String statement = "I love";
		System.out.println(statement + " " + name);
		System.out.println("_____________________");
		
		
		String car = "Honda";
		int year = 2020;
		
		System.out.println(name + " has a " + car + " of year " + year);
		
		//Concatenation of two Strings
		System.out.println("Honda of year " + "2020");
		
		//Concatenation with a String with a integer
		System.out.println("Honda of year " + 2020);
		
		//Concatenation of a String with an variable of type integer
		System.out.println("Honda of year " + year);
		
		//Concatenation multiple things
		System.out.println(car + " of year " + year);
		
		
		

	}

}
