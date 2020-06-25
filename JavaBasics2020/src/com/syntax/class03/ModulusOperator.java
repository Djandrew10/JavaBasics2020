package com.syntax.class03;

public class ModulusOperator {

	public static void main(String[] args) {
		double d1 = 12.5;
		double d2 = 4.7;
		double doubleResult = d1 / d2;
		System.out.println("Double result is " +doubleResult);   //2.6595744680851063
		
		float f1 = 12.5f;
		float f2 = 4.7F;
		float floatResult = f1 / f2;
		System.out.println("Float result is " +floatResult);     //2.6595745
		System.out.println("*******************");
		
		int i = 14;
		int j = 4;
		int result2 = i / j;        //3.5
		double result3 = i / j;     //3.0
		
		System.out.println("The division is " + result2);
		System.out.println(result3);
		System.out.println("********************");
		
		int mod = i % j;
		System.out.println("The remainder is " + mod );
		System.out.println("******************");
		
		double num1 = 14;
		double num2 = 4;
		double div = num1 / num2;  //3.5
		System.out.println("If we devide doubles the result is " + div);
        System.out.println("_________________________");
        
        i = 20;
        j = 4;
	}

}
