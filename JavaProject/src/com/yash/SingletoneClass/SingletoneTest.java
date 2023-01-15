package com.yash.SingletoneClass;

public class SingletoneTest {
	
	public static void main(String[] args) {
		 
		Singltone a=Singltone.getInstance();
		Singltone b=Singltone.getInstance();
		Singltone c=Singltone.getInstance();
		a.str=a.str.toUpperCase();
		System.out.println(a.str);
		System.out.println(b.str);
		System.out.println(c.str);
		
		
	}

}
