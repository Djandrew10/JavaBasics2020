package com.syntax.class04;

public class MoreNestedIf {
	public static void main(String [] args) {
		//Let's have a date of the month and a day of the week
		//If it is Friday ---> We are going to watch a movie
		//                    if the date is 13 ------> Watch a scary movie
		//                    if the date is not 13 -----> Watch a comedy
		//If it's not Friday ---> We are going to study Java
		
		boolean isFriday = true;
		int date = 17;
		
		if (isFriday) {
			System.out.println("It is Friday. We are going to watch a movie");
			
			if (date == 13) {
				System.out.println("I will watch a scary movie");
			}else{
				System.out.println("I will watch a comedy");
			}
		}else {
			System.out.println("It is NOT Friday. We are going to study Java");
		}
		
		
	}

}
