package com.syntax.class02;

public class ArithmeticOperatorsDemo {

	public static void main(String[] args) {
		
       //We can do Arithmetic operation on number, int, short, byte, double, float

		int num1 = 10;
		int num2 = 5;
		int num3 = num1;
		System.out.println(num3);
		
		int sum = num1 + num2;
		System.out.println("addition --> " + sum);
		
		int sub = num1 - num2;
		System.out.println("substraction --> " + sub);
		
		int div = num1 / num2;
		System.out.println("division --> " + div);
		
		int mult = num1 * num2;
		System.out.println("multiplication --> " + mult);
		System.out.println("_______________________");
		
		double d1 = 3.4;
		double d2 = 5.73;
		double dSum = d1 + d2;
		
		System.out.println("Double addition --> " + dSum);
		
		double dSum2 = num1 + num2;
		System.out.println("dSum --> " + dSum2 );
		System.out.println("__________________________");
		
		//Order of operation
		System.out.println("Ahmed" + 10 + 30); //Not correct
		System.out.println("Ahmed " + (10 + 30));  //Correct  //First inside parenthesis, then the result
		System.out.println("Ahmed " + 10 * 30);  //First multiplication, then concatenation
		

	}

}
