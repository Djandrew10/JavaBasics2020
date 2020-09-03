package com.syntax.class12;

public class Recap2DArray {
	public static void main(String[] args) {
		String[][] animals = {
				{"cat", "dog", "bird", "hamster"},   //first array or 1st row
				{"tiger", "children", "bear"},  //second array or 2nd row	
				{"salmon", "shrimp", "sea bass"}
		};
		
		int howManyArrasys = animals.length;
		System.out.println(howManyArrasys);         //Ctrl space = auto completes the long names
		
		int element1Array = animals[1].length;    //how many coloms
		System.out.println(element1Array);
		
		String element = animals[1][1];
		System.out.println(element);
		System.out.println("----------------USING FOR LOOP--------------");
		
		//How to get all elements from 2D array?
		
		for (int rows= 0; rows<animals.length; rows++) {  //loops over rows or 1D array
			for(int col = 0; col<animals[rows].length; col++) {
				String animal = animals[rows][col];
				System.out.print(animal + " ");
			}
			System.out.println();
		}
		System.out.println("---------------USING ENHANCED FOR LOOP--------------");
		
		for (String[] array : animals) {
			for (String animal : array) {
				System.out.print(animal + " ");
			}
			System.out.println();
		}
	}

}
