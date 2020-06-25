package com.class3;

public class Modulus {

	public static void main(String[] args) {

		int a = 10;
		int b = 3;

		int div = a / b;

		System.out.println(div);  //3 or 3.3? =3
		
		//Modulus operator
		
		int mod=a%b;  //what is remaining
		
		System.out.println(mod);

		
		//examples:
		int q=23;
		int w=11;
		
		System.out.println(q%w);  //11 + 11 = 22 + 1=23 (q)
		
		int f=100;
		int g=10;
		
		System.out.println(f%g);  //Modulus operator is zero
		
		int r=47;
		int m=5;
		
		System.out.println(r%m);  // Modulus operator is 2
		
		int u=47;
		int i=10;
		
		System.out.println(u%i);  //Modulus operator is 7
		
		
		int e=5+4*6;
		
		System.out.println(e);  //29
	
		int l= - 5+4*6;
		
		System.out.println(l);  //19
		
		int x=(22+9)%7;
		System.out.println(x);  //3
		
		//Parentheses, Exponents, Multiplication/Division, Modulus, Addition/Subtraction
		
		int t=20+ -3*5 /8;
		
		System.out.println(t); //19
		
		int d= 5 + 15 / 3 * 2 - 8 % 3; //13  15:3=5 *2=10 +5=15 -2 =13;
		
		System.out.println(d);
		
		
	}

}
