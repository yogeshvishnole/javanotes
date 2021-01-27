package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionWithArraylist {

	public static void main(String[] args) {
		
		// !st use case of collection api
		// drawback we can insert into middles
		// therefore we use more specialized interface List which extends Collection interface
		
		Collection values = new ArrayList();
		values.add(1);
		values.add(2);
		values.add(3);
		values.add("Yogesh");
		
		System.out.println();
		System.out.println(values);

		
//		Iterator interface for iterating over collection objects
		
		Iterator it = values.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	
	
}
