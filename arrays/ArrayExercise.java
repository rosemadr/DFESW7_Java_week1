package com.qa.arrays;

public class ArrayExercise {

	// Create an array that will hold 10 integer values, populate the array with
	// values,
	// then call and output each element.

	public static int[] createArray(int num) {

		int[] numsArray = new int[num];
		
		for(int i = 0; i < num; i++) {
			
			numsArray[i] = i;
			
		}
		return numsArray;

	}	
	
	public static int[] multiplyArray(int[] numArray, int multi) {
		
		for(int j = 0; j < numArray.length; j++) {
			
			numArray[j] = j * multi;
			
			
		}
		
		return numArray;
	}
		


}

