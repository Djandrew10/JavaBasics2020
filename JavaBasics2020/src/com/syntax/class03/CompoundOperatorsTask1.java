package com.syntax.class03;

public class CompoundOperatorsTask1 {

	public static void main(String[] args) {
	    //Declare variable and increase by 100 using shorthand operator
		int num = 36;
		num += 100;
		System.out.println("increase --> " + num);
		
		//Declare variable and decrease by 67 using shorthand operator
		
		int num1 = 90;
		num1 -= 67;
		System.out.println("decrease --> " + num1);
		
		//Declare variable cakePiece=11 and divide cakePiece between 4 people
		//using shorthand operator
		//Each person should get an equal piece of cake
		
		int cakePiece = 11;
		cakePiece /= 4;
		System.out.println(cakePiece);
		
		//Declare variable cakePiece=25 and divide cakePiece between 7 people.
		//Using shorthand operator find out how many piece of cake left
		//after it was distributed equally among 7 people
		int cakePiece2 = 25;
		cakePiece /= 7;
		int mod = 25 % 7;
		System.out.println("divide --> " +  mod);

	}

}
