package com.Class9;

public class Pyramid {

	public static void main(String[] args) {
		/* I want to print a pattern
		 * *
		 * **
		 * ***
		 * ****
		 */
		
		for (int i=0; i<4; i++) {
			for (int y=0; y<=i; y++) {
				System.out.print('*');
			}
			System.out.println();
			
			/*rows=4 colons=6
			*  
			*  ******
			*  *    *
			*  *    *
			*  ******
			*/
			
			for (int m=1; m<=5; m++) {
			for (int n=1; n<=6; n++) {
				if (m==1 || m==5 || n==1 || n==6) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}

	}

}
}