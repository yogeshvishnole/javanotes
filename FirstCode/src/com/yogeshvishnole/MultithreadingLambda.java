package com.yogeshvishnole;






public class MultithreadingLambda {
	
	public static void main(String[] args) throws Exception {
		
		
//		Runnable r1 = new Runnable(){
//			public void run() {
//				for(int i = 0;i<5;i++) {
//					System.out.println("Firstttt");
//					try {
//						Thread.sleep(500);
//					}catch(Exception e) {
//						
//					}
//				}
//			}
//		};
//		
//
//		Runnable r2 = new Runnable(){
//			public void run() {
//				for(int i = 0;i<5;i++) {
//					System.out.println("Seconddd");
//					try {
//						Thread.sleep(500);
//					}catch(Exception e) {
//						
//					}
//				}
//			}
//		};
		
//		Runnable r1 = () -> {
//				for(int i = 0;i<5;i++) {
//					System.out.println("Firstttt");
//					try {
//						Thread.sleep(500);
//					}catch(Exception e) {
//						
//					}
//				}
//			};
//		
//		
//
//		Runnable r2 = () ->  {
//				for(int i = 0;i<5;i++) {
//					System.out.println("Seconddd");
//					try {
//						Thread.sleep(500);
//					}catch(Exception e) {
//						
//					}
//				}
//			};
//		
//		
//		Thread t1 = new Thread(r1);
//		Thread t2 = new Thread(r2);
		
		Thread t1 = new Thread(() -> {
		    System.out.println("Hello  am Yogesh");
		});
		Thread t2 = new Thread(() -> {
			System.out.println("Hello I am Nothing");
		});
		
		t1.start();
		t2.start();
		
		// isalive method is used to check if thread is running or not
				System.out.println(t1.isAlive());
				
		
		// join methodd pose the execution main thread util that thread is not completed
		
		t1.join();
		
		t2.join();
		
		System.out.println(t1.isAlive());
		
		System.out.println("Bye");
		
		
	}

}
