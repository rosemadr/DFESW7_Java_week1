package com.qa.iteration;

// Given a cost and an amount, work out the change given in specific coinage.
//For example; the cost is £4.58 and the customer pays with a £20 note so as change they receive:

public class coins {

	// fields

	String type;

	int quantity;

	public Coins

	double cost = 4.95;

	double payment = 20.00;

	public static double change(double cost, double payment) {

		double change = payment - cost;

		return change;
	}

	int coinQuantity;

	public static int largestChange(double change, int coinValue) {

		if (change > coinValue) {

			coinQuantity++;

		}

	}

}

// outputs coin type, coin quantity