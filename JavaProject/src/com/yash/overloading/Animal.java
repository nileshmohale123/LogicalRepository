package com.yash.overloading;

public class Animal {

	void eat() {

		System.out.println("eating.....");
	}

	class Dog extends Animal {
		void eat() {
			System.out.println("eating bread...");
		}
	}
}
