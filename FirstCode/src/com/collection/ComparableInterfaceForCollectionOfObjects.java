package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
	int roll_no,marks;
	String name;
	
	public Student(int roll_no,String name,int marks) {
		this.roll_no = roll_no;
		this.name = name;
		this.marks = marks;
		
	}

	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", marks=" + marks + ", name=" + name + "]";
	}
	
    @Override 
    public int compareTo(Student s) {
    	return roll_no>s.roll_no?-1:1;
    }
	
	
}

public class ComparableInterfaceForCollectionOfObjects {
	
	public static void main(String[] args) {
		
		List<Student> values = new ArrayList<>();
		values.add(new Student(1,"Yogesh",75));
		values.add( new Student(2,"Poornesh",86));
		values.add(new Student(3,"Kartik",67));
		values.add(new Student(4,"Vinayak",70));
		
		System.out.println(values);
		
		Collections.sort(values,(i,j) -> i.marks > j.marks ? 1 : -1);
		System.out.println("After sorting");
		System.out.println(values);
		
		Collections.sort(values);
		System.out.println("After sorting");
		System.out.println(values);
	}

}
