package com.syntax.class07;

public class WhileVsDoWhile {

	public static void main(String[] args) {
		//Print Hello 3 times
		
		int x = 11;
		while (x <= 3) {               //Checks before is going to the loop
			System.out.println("Hello");
			x++;
		}
		System.out.println("__________Using a Do While loop_________");
        int y = 11;
        do {
        	System.out.println("Hello");
        	y++;
        }while (y <= 3);             //Checks after is going to the loop
	}

}
