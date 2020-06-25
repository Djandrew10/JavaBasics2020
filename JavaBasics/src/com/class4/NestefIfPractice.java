package com.class4;

public class NestefIfPractice {
	public static void main(String[] args) {

		/*
		 * check if user has credit card--> check what is the balance if balance is more
		 * than 1000---> pay off imiediatelly else "You are good"
		 */

		boolean creditCard = false;
		int balance = 1000;

		if (creditCard) {
			System.out.println("Let's check the balance");
			if (balance >= 1000) {
				System.out.println("Pay off now");
			} else {
				System.out.println("you are good");
			}

		} else {
			System.out.println("Do you want a credit card");
			
			}
		}
	}

