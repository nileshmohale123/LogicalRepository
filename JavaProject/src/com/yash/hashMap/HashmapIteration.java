package com.yash.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashmapIteration {

	public static void main(String[] args) {
		
		HashMap<String, String> map=new HashMap<>();
		map.put("Java", "Nilesh");
		map.put("Tester", "Yogesh");
		map.put("python", "Vijay");
		
		for(Map.Entry<String, String> entry:map.entrySet())

         System.out.println("Key ="+entry.getKey() + ", Value= " +entry.getValue());
		
	}
}

//5867