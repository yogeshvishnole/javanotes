package com.yogeshvishnole;

class T1 implements Runnable{
	
	public void run() {
		for(int i = 0;i<5;i++) {
			System.out.println("T111111111");
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				
			}
		}
	}
	
}

class T2 implements Runnable{
	
	
	public void run() {
		for(int i = 0;i<5;i++) {
			System.out.println("T222222222222");
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				
			}
		}
	}
	
}

public class RunnableDemo {

	public static void main(String[] args) {
		Runnable r1 = new T1();
		Runnable r2 = new T2();
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();

	}

}
