package com.yash.practice;

import java.util.Arrays;

public class MaxMinNoArrayJava8 {
	
	public static void main(String[] args) {
		
		int arr[]= {11,22,33,44,55,66,77,88,99};
		
		int max=Arrays.stream(arr).max().getAsInt();
		
		int min=Arrays.stream(arr).min().getAsInt();
		
		System.out.println("Max no in array: "+max);
		System.out.println("Min no in Array: "+min);
	}

}
