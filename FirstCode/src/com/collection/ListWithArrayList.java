package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListWithArrayList {
	
	public static void main(String[] args) {
		List values = new ArrayList();
		values.add(4);
		values.add(6);
		values.add(9);
		values.add("Yogesh");
		
		// inserting at a particular index
		
		values.add(2,20);
		System.out.println();
		System.out.println(values);
		
		//Iteration using iterator
		
       Iterator it = values.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// Iteration using for loop
		
		System.out.println("In loop");
		
		for(int i = 0;i<values.size();i++) {
			System.out.println(values.get(i));
		}
		
		// Iteration using for each
		
		System.out.println("In for each");
		
		for(Object o:values) {
			System.out.println(o);
		}
		
//		Note: Collection api make use of wrapper classes
		
		
	}
}
	
