
class Super{
     void show() {
    	 System.out.println("In super");
     }
}

class Base extends Super{
	void show() {
		System.out.println("In base");
	}
void config() {
	System.out.println("In B config");
}
}

public class DynamicMethodDispatch {
	
	public static void main(String[] args) {
	 Super obj = new Base(); // run time linking
	 // It is also called dynamic method dispatch
	 // reference of super class object of base class
	 
	 //  Twp types of polymorphism
	 
//	 compile time example --> method overloading
//	 runtime example --> Dynamic method dispathc
	 obj.show();
	 
	 // below code is not possible because we make reference of Super class 
	 
//	 obj.config()
	}

}
