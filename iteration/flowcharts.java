package com.qa.interation;

public class Flowcharts {

	public static void basicFlow() {

		for (int A = 100; A <= 200; A++) {

			if (A % 2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}

			// System.out.println("A");
			// A++;
		}

	}

	// 3. Create a method that can print out the numbers 1-10 10 times each.

	public static void printNums() {
		
		for(int countA = 1; countA <= 10; countA++) {
			
			for(int countB = 0; countB < 10; countB++) {
				
				System.out.println(countA);
				
			}
		}

//		Create a method to print the numbers 1 to 10 as many times as the value of that number.
//		For example; you will print 1 once, and 10 ten times.	

	public static void printNumsTree() {

		for (int countA = 1; countA <= 10; countA++) {

			for (int countB = 1; countB <= countA; countB++) {

				System.out.println(countA);
			}
		}

	}

}
