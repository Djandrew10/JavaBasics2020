package com.syntax.class07;

public class IncrementDecrement {
	public static void main(String [] args) {
		int x = 10;
		x = x + 1;
		x += 1;
		// another way to add 1 into the variable
	    x++; // post-increment
	    ++x; // pre-increment
		
		System.out.println(x);
		System.out.println(x++);
		// 3++;  --> compiler error
		// 3--; ---> compiler error
		
		int y = 50;
		y = y - 1;
		y -=1;
		y--;
		System.out.println(y);
		
		int z = 5;                     // Pre-increment
		// System.out.println(z++);
		if (++z == 6) {
			System.out.println("Hi there!");
			
			int k = 10;               // Post-increment
			if (k++ == 11) {
				System.out.println("Adrian was here!");
			}
			System.out.println(k);
			
			//What if i want to increase by 2?
			int m = 5;
			// m++2; --> compile error
			//only if ---> m += 2; or --->  m = m + 2;
		}
	}

}
