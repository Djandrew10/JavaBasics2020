package com.Class17;

public class Greetings1 {

	public static void main(String[] args) {
		
		Greetings obj =new Greetings();
		 obj.findLargest(39, 44);
		}
		void findLargest(int num1, int num2) {
		
		
		if(num1>num2) {
			System.out.println("num1 is larger than num2");
		}else {
			System.out.println("num2 is larger than num1");
		}
	}

}
