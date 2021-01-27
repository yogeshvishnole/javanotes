class Ano{
	void show() {
		System.out.println("in class Ano");
	}
}


// we wanted to override the show class only we have this single purpose 
// so instead of creating a class for it we can create a anonymous class as 
// described below.

public class AnonymousClass {
 
	 public static void main(String[] args) {
		   
		 Ano obj = new Ano() {
			 void show() {
				 System.out.println("I am the best");
			 }
		 };
		 
		 obj.show();
		 
	 }
	
}
