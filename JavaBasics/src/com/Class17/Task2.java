package com.Class17;

public class Task2 {
	
	int num;

	public static void main(String[] args) {
	
	Task2 obj=new Task2();
	obj.isEvenOrOdd(42);
	

	}
	void isEvenOrOdd (int num) {
		
		if (num ==0){
			System.out.println("is even number");
		}else {
			System.out.println("is odd number");
		}
	}

}
