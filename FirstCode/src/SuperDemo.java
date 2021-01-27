
// super() method without parameter is called in constructore of every child class
// for calling the parameterized ine of the parent we have to pass the parmaetre in the super 
//method and cal by overseleves
 


class A{
	public A() {
		System.out.println("in A ");
	}
	public A(int a) {
		System.out.println("in A prameterized");
	}
	
}

class B extends A{
	public B() {
		System.out.println("in B default");
	}
	
	public B(int n) {
		super(n);
		System.out.println("in B parameterised");
	}
}

public class SuperDemo {
	
	public static void main(String[] args) {
		B b = new B(10);
		
	}

}
