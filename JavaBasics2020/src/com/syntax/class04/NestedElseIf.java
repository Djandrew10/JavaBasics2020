package com.syntax.class04;

public class NestedElseIf {

	public static void main(String[] args) {
		//if student complete the quiz, we will check the score
		//if score >90 --> A, Great job!
		//if score >80 --> B, Well done!
		//if score >70 --> C, Just passed!
		//otherwise -----> F, You failed!
		//If student did not complete the Quiz, Please finish the quiz!
		
		boolean completed = true;
		int score = 82;
		
		if (completed) {
		if (score >=90) {
			System.out.println("A, Great Job!");
		}else if (score >=80) {
			System.out.println("B, Well Done!");
		}else if (score >=70) {
			System.out.println("C, Just Passed!");
		}else {
			System.out.println("F, You Failed!");
		}
		}else {
		System.out.println("Please finish the Quiz!");

		}}}
