

interface Demo{
	void show();
	default void display() {
		System.out.println("Hello");
	}
}

public class DefaultMethodInterface {

	
	public static void main(String[] args) {
	     Demo obj = () -> System.out.println("Hi");
	     obj.display();
	}
	
	
}
