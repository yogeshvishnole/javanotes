package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface {

	 public static void main(String[] args) {
		 
		 // We can also implement Map using HashTable
		 
		 // HashTable is synchronized 
		 
		 // means HashTable is Thread safe
		 
		 // so when you need thread safety use HashMap
		 
		 Map<String,String> map  = new HashMap<>();
		 map.put("name", "Yogesh");	
		 map.put("college","Acropolis");
		 map.put("city","Khargone");
		 map.put("village","Tema");
		 System.out.println(map);
		 
         System.out.println(map.get("name"));
         
//         Set<String> mapKeys = map.keySet();
         
         for(String key:map.keySet()) {
        	 System.out.println(key + " = " + map.get(key));
         }
	 }
	
}
