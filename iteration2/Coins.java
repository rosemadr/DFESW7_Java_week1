package com.qa.iteration2;


//Given a cost and an amount, work out the change given in specific coinage.
//For example; the cost is £4.58 and the customer pays with a £20 note so as change they receive:


public class Coins {

	public static void main(String[] args) {
		
		int cost = 458; //cost in pence!!
		
		int payment = 2000; //payment in pence as well
		
		int change = payment - cost;
		
		System.out.println(change);
		
	
		
		
		int twentyCount = 0;
		int tenCount = 0;
		int fiveCount = 0;
		int twoCount = 0;
		int poundCount = 0;
		int fiftypCount = 0;
		int twentypCount = 0;
		int tenpCount = 0;
		int fivepCount = 0;
		int twopCount = 0;
		int onepCount = 0;
		

		int coinage;
		

	while (change > 0)	{
		if (2000 <= change) {
			
			coinage = 2000;
			change = change - coinage; 
			twentyCount++;			
			
		} else if (1000 <= change) {
			
			coinage = 1000;
			change = change - coinage;
			tenCount++;
			
		} else if (500 <= change) {
			
			coinage = 500;
			change = change - coinage; 
			fiveCount++;
			
		} else if (200 <= change) {
			
			coinage = 200;
			change = change - coinage; 
			twoCount++;
			
		} else if (100 <= change) {
			
			coinage = 100;
			change = change - coinage; 
			poundCount++;
			
		} else if (50 <= change) {
			
			coinage = 50;
			change = change - coinage; 
			fiftypCount++;
			
		} else if (20 <= change) {
			
			coinage = 20;
			change = change - coinage; 
			twentypCount++;
			
		} else if (10 <= change) {
			
			coinage = 10;
			change = change - coinage; 
			tenpCount++;
			
		} else if (5 <= change) {
			
			coinage = 5;
			change = change - coinage; 
			fivepCount++;
			
		} else if (2 <= change) {
			
			coinage = 2;
			change = change - coinage; 
			twopCount++;
			
		} else if (1 <= change) {
			
			coinage = 1;
			change = change - coinage; 
			onepCount++;
		}
		
		
//		System.out.println("still in the while loop");
//		
//		System.out.println(change);
	}	
		
	System.out.println("£20s: " + twentyCount);

	System.out.println("£10s: " + tenCount);

	System.out.println("£5s: " + fiveCount);
	
	System.out.println("£2s: " + twoCount);
	
	System.out.println("£1s: " + poundCount);
	
	
	System.out.println("50ps: " + fiftypCount);
	
	System.out.println("20ps: " + twentypCount);
	
	System.out.println("10ps: " + tenpCount);
			
	System.out.println("5ps: " + fivepCount);
	System.out.println("2ps: " + twopCount);
	System.out.println("1ps: " + onepCount);
	
	
	}


		
		

	
	
	public static String coinageValue(int coinage) {
		
		String coinageString;
		
		switch (coinage) {
		
		case 2000:
			coinageString = "£20";
			break;
		case 1000:
			coinageString = "£10";
			break;
		case 500:
			coinageString = "£5";
			break;
		case 200:
			coinageString = "£2";
			break;
		case 100:
			coinageString = "£1";
			break;
		case 50:
			coinageString = "50p";
			break;
		case 20:
			coinageString = "20p";
			break;
		case 10:
			coinageString = "10p";
			break;
		case 5:
			coinageString = "5p";
			break;
		case 2:
			coinageString = "2p";
			break;
		case 1:	
			coinageString = "1p";
			break;
		default:
			coinageString = "";
			break;	
		}
		
		return coinageString;
	}
	
	

}
