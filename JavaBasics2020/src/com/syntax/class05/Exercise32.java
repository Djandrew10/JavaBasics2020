package com.syntax.class05;
import java.util.Scanner;
public class Exercise32 {

	public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    System.out.println("Please enter your gender: M or F");
		  char gender = scan.next().charAt(0);
		  char f = 'F';
		  char m = 'M';
		  System.out.println("Please enter your age");
		  int age = scan.nextInt();
		  
		  if (age > 25){
		    if (gender == f){
		      System.out.println("Woman");
		    }else if (gender == m){
		      System.out.println("Man");
		    }
		  }else if(age < 25){
		    if(gender == f){
		      System.out.println("Girl");
		    }else if (gender == m){
		      System.out.println("Boy");
		    }}}}
