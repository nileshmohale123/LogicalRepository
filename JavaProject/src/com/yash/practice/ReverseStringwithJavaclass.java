package com.yash.practice;

public class ReverseStringwithJavaclass {
	
	public static void main(String[] args) {
		
		String str="NileshMohale";
		
		StringBuilder s=new StringBuilder();
		s.append(str);
		s.reverse();
		System.out.println(s);
	}

}
