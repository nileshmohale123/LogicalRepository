package com.yash.logical;

public class Singleton {
	
	private static Singleton s=null;
	
	String str;
	
	private Singleton() {
		
		str="it is singleton class testing...";
	}
	
	public static Singleton getInstance() {
		
		if(s==null)
			s=new Singleton();
		return s;
	}

}
