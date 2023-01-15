package com.yash.logical;

import java.util.Arrays;

public class LargestNoArrayUsingJava8 {

	public static void main(String[] args) {

		int arr[] = { 28, 34, 55, 33, 77 };
		System.out.println("Total Number of Arrays: " + Arrays.toString(arr));

		int max = Arrays.stream(arr).max().getAsInt();

		int min = Arrays.stream(arr).min().getAsInt();

		System.out.println("Max Number in Arrays :" + max);
		System.out.println("Min Number in Arrays" + min);
	}

}
