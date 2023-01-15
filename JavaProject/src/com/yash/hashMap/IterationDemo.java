package com.yash.hashMap;

import java.util.HashMap;
import java.util.Map;

public class IterationDemo {
	public static void main(String[] args) {

		Map<String, String> gfg=new HashMap<>();
		
		gfg.put("Java", "Nilesh");
		gfg.put("Testing", "Nagesh");
		gfg.put("Python", "Parag");
		
        // using for-each loop for iteration over Map.entrySet()
      for(Map.Entry<String, String> entry:gfg.entrySet())
    	  
    	  System.out.println("Key =" +entry.getKey() + 
    			  " , value = "+ entry.getValue());
      
	}

}
