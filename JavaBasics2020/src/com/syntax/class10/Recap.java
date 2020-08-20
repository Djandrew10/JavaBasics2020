package com.syntax.class10;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		
		for (int i = 1; i <=3; i++) {
			System.out.println("Next iteration of outer loop");
			
			for (int j = 1; j <=5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("__________________________________");
		
		//If I want, I can read rows from Scanner
		
		int rows = 3;
		int cols = 7;
		
		for (int i = 1; i <=3; i++) {
			
			for (int j = 1; j <=7; j++) {
				System.out.print(i);
			}
			System.out.println();
		}	
			System.out.println("==========================================");

		// There are 4 floors
		// Room numbers go from 1.1, 1.2 ... 1.7
			
			int floor = 4;
			int room = 7;
			
			for (int i = 1; i<=floor; i++) {
				//We just moved to a new floor
				System.out.println("We are on floor " +i + "--->");
				
				//We are iterating the rooms
				for (int j = 1; j<=room; j++) {
					System.out.print(i + "." + j + " ");
				}
				//The stairs to the next floor
				System.out.println();
			}

		// Task: Ask the user how many floors does your hotel have?
		// And how many rooms on each floor.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many floors does your hotel have?");
		int floors = scan.nextInt();
		
		System.out.println("How many rooms in each floor?");
		int rooms = scan.nextInt();

		for (int i = 1; i <= floors; i++) {
			// We just moved to a new floor
			System.out.print("Floor #" + i + " --> ");

			// We are iterating the rooms
			for (int j = 1; j <= rooms; j++) {

				System.out.print(i + "." + j + " ");
			}

			// The stairs to the next floor
			System.out.println();
		}

	}

}
