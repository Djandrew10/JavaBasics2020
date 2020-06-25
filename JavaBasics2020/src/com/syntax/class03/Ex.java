package com.syntax.class03;

public class Ex {

	public static void main(String [] args){
		
		int num1 = 5;
		int num2 = 4;
		int num3 = 3;
		int num4 = 7;
		int num5 = 10;
		int num6 = 5;
		
		   int result1 = num1 + num2 - num3;
		   int result2 = num4 * num5 / num6;
		   int blank3 = result2 % result1;
		
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(blank3);
		System.out.println(result2 +" modded by "+result1+" is "+blank3);
		System.out.println("****************************");
		
		int d1 = 29;
	    int d2 = 4;
	    int mod = d1 % d2;
	    
	    System.out.println(mod);
	    System.out.println("****************************");
	    
	    int sNumber = -21;
	    int gNumber = 4;
	    int resultNumber = -21 % 4;
	    
	    System.out.println(resultNumber);
	    System.out.println("+++++++++++++++++++++++++");
	    
	    double d = 500.4444 ;         
        //explicit type casting 
        long l = (long)d;  
        System.out.println(l);
		

	}

}
