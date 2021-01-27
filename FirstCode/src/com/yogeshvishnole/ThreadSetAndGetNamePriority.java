package com.yogeshvishnole;

public class ThreadSetAndGetNamePriority {

	
	  public static void main(String[] args) {
		  
		  Thread t1  = new Thread(() -> {
			  for(int i = 0;i<10;i++){
				  System.out.println("Hello");
				  System.out.println(Thread.currentThread().getPriority());
			  }
		  },"t1");
		  
		  Thread t2  = new Thread(() -> {
			  for(int i = 0;i<10;i++) {
				  System.out.println("Hi");
			  }
		  },"t2");
		  
		 System.out.println(t1.getName()); 
		  System.out.println(t2.getName()); 
		  
		  System.out.println(t1.getPriority());
		  System.out.println(t2.getPriority());
		  
		  t1.setPriority(Thread.MAX_PRIORITY);
		  t2.setPriority(Thread.MIN_PRIORITY);
		  
		  System.out.println(t1.getPriority());
		  System.out.println(t2.getPriority());
		  
		  t1.setName("t1 changed");

		  t2.setName("t2 changed");
		  
		  System.out.println(t1.getName()); 
		  System.out.println(t2.getName()); 
		  
		  t1.start();
		  t2.start();
	  }
	  
	  
}
