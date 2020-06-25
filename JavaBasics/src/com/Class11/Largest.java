package com.Class11;

public class Largest {

	public static void main(String[] args) {
		//Create an array of integers and find largest number

		int[] numbers= {200,-20,13,499,65,650000};
		int largest=numbers[0];
		for (int i=0; i<numbers.length; i++) {
			if(numbers[i]>largest) {
				largest=numbers[i];
			}
			}
			System.out.print("The largest number is "+largest);
	}

}
