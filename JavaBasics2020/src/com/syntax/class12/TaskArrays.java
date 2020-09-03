package com.syntax.class12;

public class TaskArrays {
	public static void main(String[] args) {
	//Create an array of foods: american, russian, moldovian, italian.
	//Then retrieve all values from that array using 2 different loops
	
	String[][] food = {
			{"burger", "fries", "cheesecake", "chicken waffle"},
			{"borsh", "olive", "kotleti", "vinegret"},
			{"mamaliga", "jumere", "sarmale", "mititei"},
			{"pizza", "raviolli", "meatballs", "pasta"}
	};
	int howManyArrays = food.length;
    System.out.println(howManyArrays);
    System.out.println("---------Using For Loop-----------");
    
    for (int r = 0; r<food.length; r++) {
    	for (int c = 0; c<food[r].length; c++) {
    		String f = food[r][c];
    		System.out.print(f + " ");
    	}
    	System.out.println();
    }
    	System.out.println("----------Using Enhanced For Loop----------");
    	for (String[] array : food) {
    		for (String f : array) {
    			System.out.print(f + " ");
    		}
    		System.out.println();
    	}

	}


	}

