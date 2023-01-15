package com.yash.practice;

import java.util.Arrays;
import java.util.Comparator;

public class SecLargsetThirdLargestNoArrayJava8 {
	
	public static void main(String[] args) {
		
		int arr[]= {11,22,33,44,55,66,77,88,99};
		
		int seclargestNo=Arrays.stream(arr)
				.boxed()
				.sorted(Comparator.reverseOrder())
				.limit(2)
				.skip(1)
				.findFirst()
				.get();
		
		System.out.println(seclargestNo);
		
		int thirdlargestno=Arrays.stream(arr)
				.boxed()
				.sorted(Comparator.reverseOrder())
				.limit(3)
				.skip(2)
				.findFirst()
				.get();
		System.out.println(thirdlargestno);
	}

}
