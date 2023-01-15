package com.yash.logical;

import java.util.HashMap;
import java.util.Map;
public class HashmapIteration {
	
	public static void main(String[] args) {
		
		HashMap<String, String> map=new HashMap<>();
		map.put("Java Developer", "Nilesh Mohale");
		map.put("Tester", "Nagesh");
		map.put("Python", "Parag Pande");
		
		
		for(Map.Entry<String, String> entry:map.entrySet())
			
			System.out.println("Key :"+entry.getKey() + "value :"+entry.getValue());

			
	}

}
