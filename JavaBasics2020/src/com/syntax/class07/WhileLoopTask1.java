package com.syntax.class07;

public class WhileLoopTask1 {

	public static void main(String[] args) {
		//How to print numbers from 1 to 50?
		System.out.println("____________1 to 50_____________");
		
    int num = 1;
		while (num <= 50) {
			System.out.println(num);
			num++;
		}
     System.out.println("____________20 to 30___________");
       //How to print numbers from 20 to 30?
     int y = 20;
     while (y <= 30) {
    	 System.out.println(y);
    	 y++;
     }
     System.out.println("____________5 to 15 in the same line_____________");
     
     //How to print numbers from 5 to 15 in the same line?
     int z = 5;
     while (z < 16) {
    	 System.out.print(z +" ");
    	 z++;
     }
     System.out.println();
     System.out.println("___________10 to 1____________");
     
     int x = 10;
     while (x >= 1) {
    	 System.out.println(x);
    	 x--;
     }
	}

}
