package com.syntax.class07;

public class WhileLoopDemo {
	public static void main(String [] args) {
		int time = 10;
		
		if (time > 12) {
			System.out.println("Good morning");  // This will execute 1 time
		}
		System.out.println("______________While Loop______________");
		
		while (time < 12) {
			System.out.println("Good morning Adrian");  // This will execute infinitely
		    time++;                                     // we fixed it by adding time++
		}
		while (time > 12){
		System.out.println("Good morning!"); // This will not execute
		}
	}

}
