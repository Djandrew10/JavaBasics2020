package com.syntax.class03;

public class IfElseStatementTask {

	public static void main(String[] args) {
		// 1. Create a Java program and name it Double Comparison. 
		//Declare 2 double values and if value of first variable is higher
		//then the second, print "Double value__ is larger than __."
		//Otherwise print...
		
		double value = 305.68;
		double value1 = 250.89;
		if (value > value1) {
			System.out.println("Double value " + value+ " is larger than " +value1);
		}else {
			System.out.println("Double value " + value+ " is not larger than " +value1);
		}
		
		
		//2. Create a Java program and name it Temperature Check. 
		//Create variable to store temperature.Your program should check if 
		//temperature is below 32 then it should print "Water will freeze with temperature __", 
		///otherwise "Water will NOT freeze with temperature __".
		
		byte temperature = 32;
		if (temperature <= 32) {
			System.out.println("Water will freeze with temperature "+ temperature);
			}else{
				System.out.println("Water will NOT freeze with temperature " +temperature);
				
			
		}

	}

}
