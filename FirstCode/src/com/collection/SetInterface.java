package com.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {
	
	public static void main(String[] args) {
		
		// Set only stores unique values
		// Set gives values in random order
		
		Set<Integer> values = new HashSet<>();
		values.add(5);
		values.add(6);
		values.add(9);
		values.add(6);
		values.add(97);
		values.add(100);
		
		for(int i:values) {
			System.out.println(i);
		}
		
		// TreeSet implementation of Set interface
		// Treeset stores data in ascending order
		
		System.out.println("Tree set values");
		Set<Integer> values2 = new TreeSet<>();
		values2.add(92);
		values2.add(50);
		values2.add(67);
		for(int i:values2) {
			System.out.println(i);
		}
		
	}

}
