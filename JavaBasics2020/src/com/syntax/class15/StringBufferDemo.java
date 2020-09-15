package com.syntax.class15;

public class StringBufferDemo {
	public static void main(String[] args) {
		
	

	StringBuffer strBuffer = new StringBuffer("Hello");//is a mutable object
	
	strBuffer.append(" friends"); //when we perform the operation it happens on same Object and NO NEW Objects gets created
	
	System.out.println(strBuffer); //Hello friends
	
	String str2 = "Hello";  //String is Immutable object = not changeable
	str2.concat("friends");  //new Object get's created that will have value "Hello friends" --> no one takes it
	
	System.out.println(str2); //Hello
	
	}
}