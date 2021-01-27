
class Student{
	int name;
}

public class ArrayDemo {
    public static void main(String[] args) {
    	
    	// Array are object in java so they are created in heap memory unlike c/c++
    	// Arrays are initialized aith value 0 in java
    	int arr[] = new int[5];
    	arr[0] = 1;
    	
//    	// Array with array initializer
//    	
    	int a[] = {1,2,3,4,56};
    	
    	// Enhanced for loop
    	
    	for(int num:a) {
    		System.out.println(num);
    	}
    	
    	
//    	
//    	// Array of arrays 2d array
//    	
    	int d[][] = {
    			{1,2,2,4},
    			{2,3,4,5},
    			{4,5,6,7}
    	};
    	
    	// Enhanced for loop with 2 d
    	
    	for(int num1[]:d) {
    		for(int num:num1) {
    			System.out.print(" " + num);
    		}
    		System.out.println();
    	}
    	
    	
//    	
//    	// Jagged array
//    	
//    	int jA[][] = {
//    			{1,23,2},
//    			{5,6,7,8,9,10}
//    			,{11,22}
//    	};
//    	
//    	// Length of array
//    	System.out.println(a.length);
//    	
//    	// Accessing all elements of jagged array
//    	
//    	for(int i = 0;i<jA.length;i++) {
//    		for(int j = 0;j<jA[i].length;j++) {
//    			System.out.print(jA[i][j]);
//    		}
//    		System.out.println();
//    	}
//    	
//    
    	
    	
    	// Array of object
    	
    	Student s[] = new Student[4];
    	s[0] = new Student() ;
    	System.out.println(s[0]);
    }
}
