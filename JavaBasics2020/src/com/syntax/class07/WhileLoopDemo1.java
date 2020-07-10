package com.syntax.class07;

public class WhileLoopDemo1 {

	public static void main(String[] args) {
		
		boolean isRain = true;
		if (isRain) {
			System.out.println("Take your umbrella");  // 1 time
		}
//      while (isRain){
//      System.out.println("Take your umbrella");   // infinitely
//      }
		System.out.println("___________while isRain___________");
		
		while (isRain) {
			System.out.println("Take your umbrella");
//           isRain++;                             //Compiler error
			isRain = false;
		}

	}

}
