package com.yash.staticmethod;

public class StaticDemo1 {
    // Rule2-A "static" method can call only other static methods and
	// can not call a non static method.
	static void display() {
		//show();
		System.out.println("1");

	}

	void show() {

		System.err.println("2");
	}

}

//Cannot make a static reference to the non-static method show() from the type StaticDemo1
