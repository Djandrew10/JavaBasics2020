package com.class2;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// Declare 2 int variables and then we perform:
		// addition, substraction, multiplication, division

		// 1.
		int a = 30;
		int b = 15;

		System.out.println(a + b); // 45
		System.out.println(a - b); // 15
		System.out.println(a * b); // 450
		System.out.println(a / b); // 2

		// 2.
		int sum = a + b;
		int sub = a - b;
		int mult = a * b;
		int div = a / b;

		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mult);
		System.out.println(div);

		// print: the __ of 2 numbers is __

		System.out.println("The addition of 2 numbers is " + sum);
		System.out.println("The substraction of 2 numbers is " + sub);
		System.out.println("The multiplication of 2 numbers is " + a * b);
		System.out.println("The division of 2 numbers is " + div);

	}

}
