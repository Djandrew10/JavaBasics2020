package com.class2;

public class Homework1 {
	public static void main(String[] args) {
		
		String a="Hello";
		String b="Bye";
		
		int x=10;
		int y=20;
		
		System.out.println(x+y+a+b);  //30HelloBye
		System.out.println(x+a+y+b);  //10Hello20Bye
		System.out.println(x+a+b+y);  //10HelloBye20
		System.out.println(a+b+x+y);  //HelloBye30 didn't work; HelloBye1020
		System.out.println(a+x+y+b);   //Hello1020Bye
		System.out.println(a+b+(x+y));  //HelloBye30
		System.out.println(x+(y+a)+b);   //1020HelloBye
		
		double ed=8.2;
		double mult=ed*ed;
		System.out.println("The multiplication of " +ed+ " times itself is equal to " +mult);
		
		
		
	}

}
