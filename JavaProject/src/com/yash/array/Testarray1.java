package com.yash.array;
//Java Program to illustrate the use of declaration, instantiation   
//and initialization of Java array in a single line
public class Testarray1 {
	
	public static void main(String[] args) {
		
		int a[]= {10,23,44,68};
		//printing array  
		for(int i=0;i<a.length;i++)//length is the property of array  
		System.out.println(a[i]); 
		
		//printing array using for-each loop  
		
		System.out.println("Using For each loop:-");
		for(int i:a)  
		System.out.println(i);  
		
	}

}
