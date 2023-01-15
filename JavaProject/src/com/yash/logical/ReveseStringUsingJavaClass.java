package com.yash.logical;

//Java program to ReverseString using StringBuilder
public class ReveseStringUsingJavaClass {

	public static void main(String[] args) {

		String str = "Nilesh Pandurang Mohale";

		StringBuilder input1 = new StringBuilder();
		// append a string into StringBuilder input1
		input1.append(str);

		// reverse StringBuilder input1
		input1.reverse();
		// print reversed String
		System.out.println(input1);

	}
}
