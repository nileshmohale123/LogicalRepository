package com.yash.logical;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondLargestNumberInAnArraysUsingJava8Stream {

	public static void main(String[] args) {
		// random number'
		int[] number= {5, 9, 11, 2, 8, 21, 1};
		
		System.out.println("Number in Arrays : " + Arrays.toString(number));
		//System.out.println(number);  // to get 

		// sort in descending-order and get 2nd largest element
        int secondLargestNumber = Arrays
                .stream(number)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .skip(1)
                .findFirst()
                .get();
        

        // print sum to console
        System.out.println("\nSecond largest number in an Arrays is - "
                + secondLargestNumber);
 
	}
	
}
