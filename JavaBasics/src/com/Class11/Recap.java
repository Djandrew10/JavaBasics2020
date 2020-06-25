package com.Class11;

public class Recap {

	public static void main(String[] args) {
		// Let's create an array of names that will hold 5 elements and retrieve all values
		
		String[] names=new String[7];
		
		names[0]="Asel";
		names[1]="Awet";
		names[2]="Arit";
		names[3]="Weqas";
		names[4]="Dzimitry";
		names[5]="Shiva"; //will get an runtime exception when trying to access it
		names[6]="Sandesh";
		
		for (int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
			
			//2.Create an array using array literal
			                          //0          1         2        3        4      5
			String[] studentNames= {"Adrian","Anastasia","Asel","Alexandru","Denis","Olya"};
			System.out.println("________for loop________");
			for (int i=0; i<=studentNames.length-1; i++){
				System.out.println(studentNames[i]); //6
			}
			
			//Retrive values using: advanced for loop, for each loop, enhanced for loop
			System.out.println("____________Advanced for loop________");
			for (String student:studentNames)
				System.out.println(student);
		}
		

	}


