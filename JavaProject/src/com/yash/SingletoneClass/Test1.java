package com.yash.SingletoneClass;

public class Test1 {
	public static void main(String[] args) {

		// instantiating Singleton class with variable a

		Singleton a = Singleton.getInstance();
		// instantiating Singleton class with variable b

		Singleton b = Singleton.getInstance();

		// instantiating Singleton class with variable c
		Singleton c = Singleton.getInstance();
		/*
		 * // changing variable of instance a a.str = (a.str).toUpperCase();
		 */

		System.out.println("String of a is : " +a.str);
		System.out.println("String of b is : "+b.str);
		System.out.println("String of c is : "+c.str);
	}

}
