package com.Class9;
import java.util.Scanner;
public class HomeworkTasks {
	public static void main(String[] args) {
		/*1.Write a program that reads a range of integers (start and end point), 
		*provided by a user and then from that range prints the sum of the even and odd integers.
		*/
		
		//Scanner will take an input from user
		Scanner input;
		int startPoint;
		int endPoint;
		int sumOfEven=0;
		int sumOfOdd=0;
		
		input = new Scanner(System.in);
		System.out.println("Enter your start point: ");
		startPoint=input.nextInt();
		System.out.println("Enter your end point");
		endPoint=input.nextInt();
		
		if(startPoint<endPoint) {
			for (int a=startPoint; a<=endPoint; a++) {
				if(a%2==0) {
					sumOfEven+=a;
				}else {
					sumOfOdd+=a;
				}
				}
		System.out.println("Your sum of even numbers are:" +sumOfEven);
		System.out.println("Your sum of odd numbers are:" +sumOfOdd);
				
		
		}
	}

}
