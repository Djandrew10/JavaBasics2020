package com.syntax.class07;

public class ForLoop {

	public static void main(String[] args) {
		//Print numbers from 1 to 5

		for (int num = 1; num <= 5; num++) {  //When you know how many times executes, we should go with for loop
			System.out.println(num);
		}
		
		int a = 1;
		while (a <= 5) {
			System.out.println(a);
			a++;
		}
	}

}