package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericsWithList {
	
	public static void main(String[] args) {
		
		// Now we make Lists Type specific using the generics concept
		// The concept of generics was introduced in 1.5
		// while collection is from 1.2
		
//		List<Integer> values = new ArrayList<Integer>(); In 1.5
//		After 1.7
		List<Integer> values = new ArrayList<>();
		values.add(4);
		values.add(6);
		values.add(9);
	
		
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
		
		for(Integer o:values) {
			System.out.println(o);
		}
		
//		Note: Collection api make use of wrapper classes
		
	}

}
