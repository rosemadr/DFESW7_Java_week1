package com.qa.calculator_exercise;

public class Runner {
	
	public static void main(String[] args)	{
		
		Calculator newCalculator = new Calculator();
		
//		int result = newCalculator.add(3,4);
		
//		if (x < y) {
		
		double result = newCalculator.divide(9, 0.33);
		
		System.out.println(result);
	
	}

}
