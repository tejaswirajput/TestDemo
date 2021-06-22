package com.cg.demo.col;

import java.util.*;

public class MapDemo {
   
	 public static void main(String[] args) {
		
		 Map<Integer, String> map = new HashMap<>();
		 
		 map.put(10, "India");
		 map.put(20, "China");
		 map.put(30, "India");
		 map.put(20, "India");
		 
		 System.out.println(map.get(20));
		 
         Map<String, String> states = new HashMap<>();
		 
         states.put("MH", "Maharashtra");
         states.put("Th", "Telengana");
         states.put("GJ", "Gujrat");
         states.put("MP", "Madhyapradesh");
		 
		 System.out.println(states);
	}
}
