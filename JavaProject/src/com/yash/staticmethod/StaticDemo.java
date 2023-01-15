package com.yash.staticmethod;

public class StaticDemo {
	//Rule1- A "static" method can access only static data.
	//it can not access no-static data.i.e instance data
	int i=10;
	static void display() {
		
		//System.out.println(i);
	}

}
