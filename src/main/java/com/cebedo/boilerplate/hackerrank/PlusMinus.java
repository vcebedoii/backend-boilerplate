package com.cebedo.boilerplate.hackerrank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Result {

	/**
	 * 
	 * @param arr
	 */
	public static void plusMinus(List<Integer> arr) {

		// Declare count variables.
		double countPositive = 0;
		double countNegative = 0;
		double countZero = 0;
		int size = arr.size();

		// For each array input,
		// check if it's positive, negative or zero.
		for (Integer input : arr) {

			if (input > 0) {
				countPositive++;
			} else if (input < 0) {
				countNegative++;
			} else {
				countZero++;
			}
		}

		// Print the results.
		double proportionPositive = countPositive / size;
		double proportionNegative = countNegative / size;
		double proportionZero = countZero / size;
		System.out.println(proportionPositive);
		System.out.println(proportionNegative);
		System.out.println(proportionZero);
	}

}

public class PlusMinus {

	public static void main(String[] args) throws IOException {

		List<Integer> input = new ArrayList<>();
		input.add(1);
		input.add(1);
		input.add(0);
		input.add(-1);
		input.add(-1);

		Result.plusMinus(input);
	}

}
