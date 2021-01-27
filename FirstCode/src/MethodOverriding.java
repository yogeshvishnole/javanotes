
class Aa{
	public void display() {
		System.out.println("Display of A");
	}
}

class Bb extends Aa{
	@Override
	public void display() {
		super.display();
		System.out.println("Display of B");
	}
}


public class MethodOverriding {
     public static void main(String[] args) {
    	 Bb b = new Bb();
    	 b.display();
     }
}
