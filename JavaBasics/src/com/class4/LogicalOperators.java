package com.class4;

public class LogicalOperators {

	public static void main(String[] args) {
		/*if nr is between 1-10 -->nr is small
		 * if nr is between 11-100-->nr is medium
		 * if nr is between 101-1000-->nr is large
		 */

		int num=15;
		if (num>1 && num <=10) {
			System.out.println("Number is small");
		}else if(num>=11 && num <=100) {
			System.out.println("Number is medium");
		}else if(num>=101 && num <=1000) {
			System.out.println("Number is large");
		}else {System.out.println("Number is not in our range ");
		}
		

	}

}
