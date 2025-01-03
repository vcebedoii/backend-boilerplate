package com.cebedo.boilerplate.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class MiniMax {

	/**
	 * 
	 * @param arr
	 */
	static void miniMaxSum(List<Integer> arr) {

		List<Long> sums = new ArrayList<>();

		for (Integer input : arr) {

			// Sum everything except current value,
			// then add to list of sums.
			long sum = 0;

			for (Integer value : arr) {
				if (input == value) {
					continue;
				}
				sum = sum + value;
			}

			sums.add(sum);
		}

		// Get the minimum and max from the list of sums.
		long min = sums.get(0);
		long max = sums.get(0);

		for (long sum : sums) {
			if (sum < min) {
				min = sum;
			}

			if (sum > max) {
				max = sum;
			}
		}

		System.out.println(min + " " + max);

	}

	/**
	 * 
	 */
	public static void main(String[] args) {

		// 256741038 623958417 467905213 714532089 938071625

		List<Integer> input = new ArrayList<>();
		input.add(5);
		input.add(5);
		input.add(5);
		input.add(5);
		input.add(5);

		miniMaxSum(input);
	}

}
