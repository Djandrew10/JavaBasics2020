package com.syntax.class07;

public class WhileLoopTask2 {

	public static void main(String[] args) {
		// Print odds numbers from 1 to 20
		
		//1st way
		int x = 1;
		while (x <= 20) {
			System.out.println(x);
			x += 2;
		}
		System.out.println("___________2nd way___________");
		
		//2nd way
		int y = 1;
		while (y < 20) {
			if (y % 2 == 1) {
				System.out.println(y);
			}
			y++;
		}
		System.out.println("_________3rd way____________");
		
		//3rd way
		int z = 0;
		while (z < 20) {
			z++;
			System.out.println(z);
			z++;
		}
		System.out.println("____________4th way__________");
		
		//4th way
		int g = 0;
		while (g < 20) {
			System.out.println(++g);
			g++;
		}

	}

}
