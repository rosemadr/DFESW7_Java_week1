package com.qa.interation;

//Create a method that takes a number 10-99, and adds the two digits together for example 74 = 7 + 4 = 11.
//Create a second method that when given the number 1-99 returns a String representation of this number, for example 1 = one, 11 = eleven, 21 = twenty-one.
//Expand on the method you wrote in Numbers 2 to allow the input 1-999.
//Expand the method you wrote in Numbers 2 to allow the input 1-9999

public class Numbers {

	public static int splitAndAdd(int num) {

		// while ()

		//
		int splitTen = num / 10;

		int splitDigit = num % 10;

		int result = splitOne + splitTwo;

		return result;
	}

	public static String writeItOutDigits(int num) {
		
		splitAndAdd(num);
		
		String digitString;
		
		switch(splitDigit) {
		
		case 1:
			digitString = "one";
			break;
		case 2:
			digitString = "two";
			break;
		case 3:
			digitString = "three";
			break;
		case 4:
			digitString = "four";
			break;
		case 5:
			digitString = "five";
			break;
		case 6:
			digitString = "six";
			break;
		case 7:
			digitString = "seven";
			break;
		case 8:
			digitString = "eight";
			break;
		case 9:
			digitString = "nine";
			break;
			
			
		return digitString;
							
			
		}

	public static String writeOutTens(int num) {
		
splitAndAdd(num);
		
		String TensString;
		
		switch(splitTen) {
		
		case 1:
			TensString = "one";
			break;
		case 2:
			TensString = "two";
			break;
		case 3:
			TensString = "three";
			break;
		case 4:
			TensString = "four";
			break;
		case 5:
			TensString = "five";
			break;
		case 6:
			digitString = "six";
			break;
		case 7:
			digitString = "seven";
			break;
		case 8:
			digitString = "eight";
			break;
		case 9:
			digitString = "nine";
			break;
			
		return digitString;
		
	}

	public static String writeOutTeens(int num) {

		splitAndAdd(num);

		String digitString;

		switch (splitDigit) {

		case 1:
			digitString = "one";
			break;
		case 2:
			digitString = "two";
			break;
		case 3:
			digitString = "three";
			break;
		case 4:
			digitString = "four";
			break;
		case 5:
			digitString = "five";
			break;
		case 6:
			digitString = "six";
			break;
		case 7:
			digitString = "seven";
			break;
		case 8:
			digitString = "eight";
			break;
		case 9:
			digitString = "nine";
			break;

		}

	}

}
