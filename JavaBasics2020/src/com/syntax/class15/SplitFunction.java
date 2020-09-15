package com.syntax.class15;

public class SplitFunction {

	public static void main(String[] args) {
		
		String str = "Today is Sunday and we have a Java class";
		String[] array = str.split("a");
		
		//String[] array = str.toLowerCase().split("s");  --> if you want the capital "S" to be considered in too
		//today i| |unday and we have a Java cla|
		
		int howManyElements = array.length;
		System.out.println(howManyElements);   //9 elements
		
		//enhanced for loop
		for(String s : array) {
			System.out.print(s + "|");  //Tod|y is Sund|y |nd we h|ve | J|v| cl|ss|
		}

	}

}
