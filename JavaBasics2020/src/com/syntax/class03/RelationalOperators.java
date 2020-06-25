package com.syntax.class03;

public class RelationalOperators {

	public static void main(String[] args) {

    int a = 7;
    int b = 10;
    
    System.out.println(3 > 4);     //False
    
    System.out.println(a > b);  //False
    System.out.println(a < b);  //True
    System.out.println(a == b);  //False
    System.out.println(a != b);  //True
    System.out.println("*****************************");
    
    double i = 10.78;
    double j = 10.55;
    boolean result1 = i >j;  //is i bigger than j? True
    System.out.println(result1);
    
    boolean result2 = i == j;  //Is i equal to j? False
    System.out.println(result2);
    
    boolean result3 = i < j; //Is i smaller than j? False
    System.out.println(result3);
    
    boolean result4 = (i != j); //Is i different than j? true
    System.out.println(result4);
    
    double c = 14.44;
    double d = 14.44;
    
    boolean result5 = c >= d; //Is c greater than or equal to d? //true
    System.out.println(result5);
    
    boolean result6 = c <= d; //Is c smaller than or equal to d? //true
    System.out.println(result6);
    


	}

}
