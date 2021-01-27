package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorWithLambda {
	
	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>();
		values.add(909);
		values.add(921);
		values.add(555);
		
		Collections.sort(values,(i,j) -> i%10>j%10?-1:1);
		
		for(Integer o:values) {
			System.out.println(o);
		}
	}

}
