package com.Class12;

public class Recap {

	public static void main(StringManipulations[] args) {
		int[][] arr= {
				{1,2,3}, //1st array that stored with index 0
				{10,20,30}, //2nd array with index 1
				{100,200,300}	//3rd array with index 2		
		};
		//How many total arrays
		for(int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) { //1  //2
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("----------For each Loop-----------");
		//Loop through each element inside 2D Array--> each element=array
		for(int[] singleArray:arr) {
			//loop through each single array
			for(int numbers:singleArray) { //{1,2,3}
				System.out.print(numbers+" ");
			}
			System.out.println();
		}

	}

}
