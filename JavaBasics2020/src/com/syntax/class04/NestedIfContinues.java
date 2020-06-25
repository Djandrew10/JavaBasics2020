package com.syntax.class04;

public class NestedIfContinues {
	public static void main(String [] args) {
		//Check if patient has allergies
		// If no allergies --> you're healthy
		//otherwise:
		//if peanut allergy: Don't eat peanut
		//if Lactose allergy: Don't drink milk
		//if bee allergy: Don't mess with bees
		//seafood allergy: Don't eat fish
		
		boolean allergies = true;
		boolean peanutA = true;
		boolean lactoseA = false;
		boolean beeA = true;
		boolean seafoodA = true;
		
		if (!allergies) {                             //allergies == true --->reverse
			System.out.println("You're healthy");
		}else {
			System.out.println("You have allergies");
		}if (peanutA){
			System.out.println("Don't eat peanut");
		}if (lactoseA){
			System.out.println("Don't drink milk");
		}if (beeA){
			System.out.println("Don't mess with bees");
		}if (seafoodA) {
			System.out.println("Don't eat fish");
		}
		}
	}


