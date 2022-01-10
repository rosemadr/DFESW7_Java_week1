package com.qa;

import com.qa.arrays.ArrayExercise;
import com.qa.iteration.*;

// this line is a comment

// public means accessible everywhere
// classes are named using PascalCase – all words are capitalised

public class Runner {
	// main is the entry point to all Java applications
	// main is a method
	// methods must be in a class
	// methods are named using camelCase


	public static void main(String[] args) {

		// System.out.println("Hello World");
		
		int[] testArray = ArrayExercise.createArray(7);
		
		//for()
		
		System.out.println(testArray[5]);
		
		int[] resultArray = ArrayExercise.multiplyArray(testArray, 6);
		
		for(int j : resultArray) {
			
			System.out.println(j);
		}
				

	}
}