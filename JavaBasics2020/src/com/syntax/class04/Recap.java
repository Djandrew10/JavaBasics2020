package com.syntax.class04;

public class Recap {

	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		boolean c = false;
		
		if (a) {
			//outer if code...
			if (b) {
				//inner if code...
			}else if (c){
				//inner else if code...
			}else {
				//inner else code...
			}
		}else {
			//outer else code...
		}

	}

}
