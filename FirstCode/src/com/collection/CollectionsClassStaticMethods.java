package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClassStaticMethods {

	public static void main(String[] args) {
		
		
		
		List<Integer> values = new ArrayList<>();
		values.add(4);
		values.add(6);
		values.add(9);
		values.add(2);
		values.add(1);
		
		// remember this static methods can work on List 
		// because List is mutable
		
		Collections.sort(values);
		
		
		for(Integer o:values) {
			System.out.print(o);
		}
		
		System.out.println();
		
		
		Collections.reverse(values);
		
		for(Integer o:values) {
			System.out.print(o);
		}
		
		System.out.println();
		
		Collections.shuffle(values);
		
		for(Integer o:values) {
			System.out.print(o);
		}
		
		System.out.println();
		
		
		
		
	

	}

}
