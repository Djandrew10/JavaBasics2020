package com.class4;

public class TaskScannerAndIf {
	public static void main(String[] args) {

		/*
		 * 1. You are loan specialist and you need to ask user what is the amount of
		 * loan is needed. If loan is less than 200000 then you would lend the money
		 * otherwise you will reject the client.
		 * 
		 * 2.You are DMV representative and you need to ask customer their age. If they
		 * are 18 and older you will issue a driver license to them, otherwise you will
		 * offer them to get a learners permit.
		 * 
		 * 3.Create a Java program and store variables to store mortgage rate and
		 * mortgage price. First program should check if rate is higher than 4.5 user
		 * will not buy a house, if price of the house is larger than 200000 then user
		 * will take a loan, otherwise user will pay cash.
		 */
		double mortgageRate = 4.3;
		int mortgagePrice = 300000;

		if (mortgageRate >= 4.5) {
			System.out.println("I'm not buying the house");
		} else {
			System.out.println("I will consider buying the house");
			if (mortgagePrice > 200000) {
				System.out.println("I will take a loan");
			} else {
				System.out.println("I will pay cash");
			}
		}

	}

}
