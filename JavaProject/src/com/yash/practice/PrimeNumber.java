package com.yash.practice;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int no=9; int temp=0;   //2,3,4,5,6
		for(int i=2; i<no-1;i++) {
			
			if(no%i==0) {
				temp=temp+1;
			}
		}
		if(temp>0) {
			
			System.out.println("No is not prime");
		}else {
			
			System.out.println("No is Prime");
		}
	}

}
