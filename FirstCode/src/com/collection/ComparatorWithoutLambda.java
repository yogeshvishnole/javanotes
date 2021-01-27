package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorWithoutLambda {

	public static void main(String[] args) {
		
		List<Integer> values = new ArrayList<>();
		values.add(404);
		values.add(401);
		values.add(909);
		values.add(376);
		
		Comparator<Integer> c = new Comparator<Integer>() {
			public int compare(Integer i,Integer j) {
				return i%10>j%10?-1:1;
			}
		};
		
		Collections.sort(values,c);
		
		for(Integer o:values) {
			System.out.println(o);
		}

	}

}
