package com.yash.staticmethod;
//A "static" method can not refer to "this" or "super"
//keyword in anyway
public class StaticDemo2 {
	
	int i=10;
	
	static void display() {
		
		//System.err.println(this.i);  //Cannot use this in a static context
	}

}
