package com.yash.practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapIterarion {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<>();
		map.put("Java Developer", "Nilesh Mohale");
		map.put("Testers", "Vijay");
		map.put("Python", "Neals");

		for (Map.Entry<String, String> entry : map.entrySet())
			System.out.println("Key: " + entry.getKey() + ", value:" + entry.getValue());
	}
}
