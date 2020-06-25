package com.Class9;

public class NestedLoopsDemo3 {

	public static void main(String[] args) {
		/*I want to print pattern
		 * 123456789--> 5 rows & 9 colums
		 * 123456789
		 * 123456789
		 * 123456789
		 * 123456789
		 */
		
		for (int i=1; i<5; i++) {
			for (int y=1; y<6; y++) {
				System.out.print(y); ///12345
				
				/*I want to print pattern
				 * 1111111
				 * 2222222
				 * 3333333
				 * 4444444
				 * 5555555
				 * 6666666
				 * 7777777
				 */
				
				
				for (int s=1; s<=7; s++) {
					for (int r=1; r<=7; r++) {
						System.out.print(s);
						
						/* I want to print pattern
						 *   *****
						 *   *****
						 *   *****
						 *   *****
						 *   *****
						 */
						
						for (int a=0; a<4; a++) {
							for (int b=0; b<5; b++) {
								System.out.print("*");
							}
							System.out.println();
							
							/* I want to print pattern
							 * 54321
							 * 54321
							 * 54321
							 * 54321
							 */
							for (int e=0; e<3; e++) {
								for (int f=0; f<5; f++) {
									System.out.print("e");
									
									/*
									 * I want to print pattern
									 * 55555
									 * 44444
									 * 33333
									 * 22222
									 * 11111
									 */
									for (int g=0; g<4; g++) {
										for (int h=0; h<5; h++) {
											System.out.print("h");
										
											
										}
									}
								}
							}
									
						
						}
					}
				}
			}
		}

	}

}
