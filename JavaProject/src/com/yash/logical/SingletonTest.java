package com.yash.logical;

public class SingletonTest {

	public static void main(String[] args) {
		
		Singleton a=Singleton.getInstance();
		Singleton b=Singleton.getInstance();
		Singleton c=Singleton.getInstance();
		
		a.str=a.str.toUpperCase();
		
		System.out.println(a.str);
		System.out.println(b.str);
		System.out.println(c.str);

	}

}
