package com.yash.logical;

//make class as final bocz subclass can extend the th file it can change the value 
//make variable as private bcoz if variable is not private so someone can change the value
//make variable as final bcoz No one can change your variable once you have declared already
//No setter method 
public final class ImmutableClass {

	private final int id;

	private final String name;

	public ImmutableClass(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {

		ImmutableClass a = new ImmutableClass(1, "Nilesh");

		System.out.println(a.name == "Nilesh");

		// a.id=23; it will give compile time error can not change the value
	}
}
