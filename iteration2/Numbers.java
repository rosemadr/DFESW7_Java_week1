package com.qa.iteration2;

//Create a method that takes a number 10-99, and adds the two digits together for example 74 = 7 + 4 = 11.
//Create a second method that when given the number 1-99 returns a String representation of this number, for example 1 = one, 11 = eleven, 21 = twenty-one.
//Expand on the method you wrote in Numbers 2 to allow the input 1-999.
//Expand the method you wrote in Numbers 2 to allow the input 1-9999

public class Numbers {

	public static void main(String[] args) {
		
//		System.out.println(tenString(10)); 
//		System.out.println(writeOutNum(10));
		
//		
		for (int i = 1; i <= 99 ; i++) {
			System.out.println(writeOutNum(i));
			
		}

	}
	
	public static int splitAndAdd(int num) {

		// while ()

		//
		int splitTen = num / 10;

		int splitDigit = num % 10;

		int result = splitDigit + splitTen;

		return result;
	}

	public static int digitNum(int num) {


		int result = num % 10;

		return result;
		
	}
	
	public static int tenNum(int num) {

		int result = num / 10;

		return result;
	}
	
	public static String digitString(int num) {

		int splitDigit = digitNum(num);

		String digitString = "";

		switch (splitDigit) {

		case 0:
			digitString = "";
			break;
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

		return digitString;
	}
	
	public static String tenString(int num) {


		int splitTen = tenNum(num);

		String tensString = "";

		switch (splitTen) {
		
		case 0:
			tensString = "";
			break;
		case 2:
			tensString = "Twenty-";
			break;
		case 3:
			tensString = "Thirty-";
			break;
		case 4:
			tensString = "Fourty-";
			break;
		case 5:
			tensString = "Fifty-";
			break;
		case 6:
			tensString = "Sixty-";
			break;
		case 7:
			tensString = "Seventy-";
			break;
		case 8:
			tensString = "Eighty-";
			break;
		case 9:
			tensString = "Ninety-";
			break;
		}

		return tensString;

	}
	
	public static String teenString(int num) {

		int splitDigit = digitNum(num);

		String teenString = "";

		switch (splitDigit) {
		
		case 0:
			teenString = "Ten";
			break;
		case 1:
			teenString = "Eleven";
			break;
		case 2:
			teenString = "Twelve";
			break;
		case 3:
			teenString = "Thirteen";
			break;
		case 4:
			teenString = "Fourteen";
			break;
		case 5:
			teenString = "Fifteen";
			break;
		case 6:
			teenString = "Sixteen";
			break;
		case 7:
			teenString = "Seventeen";
			break;
		case 8:
			teenString = "Eighteen";
			break;
		case 9:
			teenString = "Nineteen";
			break;
		}
		return teenString;
	}
	
	public static String writeOutNum(int num) {
		
		int digit = digitNum(num);
		
		int tens = tenNum(num);
		
		String numberString = "";
		
		if (tens != 1) {
			
			numberString = tenString(num);
			
			String digitString = (digitString(digit));
			
			numberString = numberString.concat(digitString);
			
		} if (tens == 0) {
			numberString = numberString.substring(0,1).toUpperCase() + numberString.substring(1);
					
		} if (digit == 0 & tens > 1) {
			
			int strLenMinusOne = numberString.length() -1;
			
			numberString = numberString.substring(0, strLenMinusOne);
		}
		
		else if (tens == 1) { 
			numberString = teenString(digit);
		}
		
		return numberString;

	}
	
}


