package com.yogeshvishnole;



/**
 * synchronized keyword make  a method thread safe
 * 
 * synchronized method restricts a method to be used by one thread at a time
 *
 */
class Counter{
	int count = 0;
    
	
	public synchronized void increment() {
		count++;
	}
	
}


public class ThreadSynchronization {
	
	public static void main(String[] args) throws Exception {
		
		Counter c = new Counter() ;
		
		Thread t1 = new Thread(() -> {
			for(int i = 0;i<1000;i++) {
				c.increment();
			}
		});
		Thread t2  = new Thread(() -> {
			for(int i = 0;i<1000;i++) {
				c.increment();
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Count is " + c.count);
		
		
		
	}

}
