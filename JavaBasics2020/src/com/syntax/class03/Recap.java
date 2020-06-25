 package com.syntax.class03;

public class Recap {

	public static void main(String[] args) {
		int num = 10 + 10 * 10;
		
		System.out.println(num);
		
		int num1 = (10 + 10) * 10;
		System.out.println(num1);
		
		int num3 = 10 * 10 + 10 / 10;
		System.out.println(num3);
		
		System.out.println("**************************");
		
		int a = 10;
		int b = 20;
		String x = "Java";
		String y = "Sunday";
		
		System.out.println(a + b + x + y);    //30JavaSunday
		System.out.println(a + x + y + b);    //10JavaSunday20
		System.out.println(x + y + a + b);    //JavaSunday1020
		System.out.println(x + y + (a + b));  //JavaSunday30     or we can add at the beggining int sum = a + b;
		
		//If I want 1020JavaSunday
		System.out.println(a + (b + x) + y);  //or (a + "" + b + x + y);  //or ("" + a + b + x + y);

	}

}
