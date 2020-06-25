package com.Class11;

public class Task1 {

	public static void main(String[] args) {
		// 1.Create an array of cars and store 6 elements into it.
		//Using 2 different loops print all values from the array.
		
String[] elements=new String[7];
		
		elements[0]="Toyota";
		elements[1]="Honda";
		elements[2]="BMW";
		elements[3]="Rover";
		elements[4]="Mercedes";
		elements[5]="Audi";
		elements[6]="Maseratti";
		
		for (int i=0; i<elements.length; i++) {
			System.out.println(elements[i]);
		}

			String[] carsNames= {"Toyota","Honda","BMW","Rover","Mercedes","Audi","Maseratti"};
			System.out.println("________for loop________");
			for (int i=0; i<=carsNames.length-1; i++){
				System.out.println(carsNames[i]);
		
			    }

	}

}

