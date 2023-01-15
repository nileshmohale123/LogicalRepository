package com.yash.SingletoneClass;

public class Singltone {

	// static variable s of type Singleton
	private static Singltone s = null;

	// variable of type String
	public String str;

	private Singltone() {

		str = "it is sigleton clsss test";

	}

	// private constructor of the Singleton class that restricted to this class
	// itself
	public static Singltone getInstance() {

		if (s == null)
			s = new Singltone();

		return s;

	}

}
