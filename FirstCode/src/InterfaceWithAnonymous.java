interface Showable{
	void show();
}

// We see that class implementor has a single task to 
// implement the show method of the showable interface

// so we can do as follow see in main method

//class Implementor implements Showable{
//	public void show() {
//		System.out.println("hello");
//	}
//}


public class InterfaceWithAnonymous {
	
	public static void main(String[] args) {
		Showable s = new Showable() {
			public void show() {
				System.out.println("Helllllllll");
			}
		};
		s.show();
	}
	

}
