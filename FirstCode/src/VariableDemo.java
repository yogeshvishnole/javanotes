
class Farzi{
	int i = 5;
	
	// static variables they are not in heap memory they are in class loader memory
	// and made when class loads
	// static variables value is shared by all objects
	static String ceo;
	
	//constructor has sam name as class name
	// Constructor not has return type
	// constructor is the method for allocating the emory to the object
	
	// Default constructor
	public Farzi() {
		System.out.println("Hi");
	}
	
	//Multiple constuctor in a class is named as constructor overloading
	
	//parameterized constructor
	public Farzi(int k) {
		System.out.println("Hello");
		this.i = k;
	}
	
	// We can have as many constructors as we want 
	// only bet is that they should have different names
	
	public Farzi(double d) {
		
	}
	
	// Method overloading
	
	public void add(int i,int j ) {
		System.out.println(i+j);
	}
	
	public void add(double i,double j) {
		System.out.println(i + j);
	}
	
	
	public void add(double i,double j,double k) {
		System.out.println(i + j +  k);
	}
	
	
	// static block only runs when class loads
	// generally use for initialize the static variables
	// or you can use according to your application needs
	// we can have multiple static blocks
	

	 static {
		 ceo = "larry";
	 }
	 
	 //  static methods
	 // We can only access static variables in a class
	 // because if we access an instance variable then our 
	 // method is unable to know it is property of which instance
	 //  non static memeber methods can accesss static variables
	 
	 public static void staticMethod(String s) {
		 ceo = s;
	 }
	 
	 
	
	
}

public class VariableDemo {
	
	   public static void main(String args[]){
		   System.out.print("hello world");
		   
		   // f is a reference to the object created  by new
		   // reference are like pointers they are made in stack memory and contain the 
		   // memory address of a place in heap memory
		   Farzi f = new Farzi(10);
		   
		   System.out.print(f.i);
		   
		   // Accessing a static variable
		   
		   //we can access via object 
		   
		   f.ceo = "Yogesh";
		   System.out.println(f.ceo);
		   
		   // Access via a classname it is the best practise
		   Farzi.ceo = "Sunil";
		   System.out.println(Farzi.ceo);
	   }

	
//	1. How to use Eclipse 
//	2. Getting    Started 
//	3. How Java Works   --> java source code --> compile --> byte code --> JVM
//	4. Variable in Java 
//	5. Working with Variables 
//	6. Primitive Data Type in Java 
//	7. Naming Convention in Java 
//	8. Arithmetic Operators in Java 
//	9. If Else | Selection Statement 
//	10. Ternary & Switch Selection Statement 
//	11. While | For | Iteration Statement | Loops 
//	12. Nested Loops | Iteration 
//	13. Break and Continue 
}
