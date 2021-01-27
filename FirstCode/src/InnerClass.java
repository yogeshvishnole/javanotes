class Outer{
	
	// Types of static classes
	// 1. member class
	// 2. static class
	// 3. Anonymous class
	
	//  In a class we have a variable method and class
	
	class Inner{
		public void display() {
			System.out.println("Inner class Display");
		}
	}
	
	
	// static inner class
	
	static class StaticInner{
		public void display() {
		 System.out.println("Display of static inner");
		}
	}
}


public class InnerClass {
   public static void main(String[] args) {
	   // Object of a inner class
	   Outer obj = new Outer();
	   
	   Outer.Inner innerObj = obj.new Inner();
	   innerObj.display();
	   
	   // Object of static inner class
	   
	   Outer.StaticInner staticInnerObj = new Outer.StaticInner();
	   staticInnerObj.display();
	  
			     
			 
   }
}
