
interface Demos{
	default void show()
	{
		System.out.println("Demo");
	}
}

interface MyDemo{
	default void show() {
		System.out.println("MyDemo");
	}
}

class DemoImpl implements Demos,MyDemo{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		Demos.super.show();
	}
	
}



public class SuperWithInterface {
	
	public static void main(String[] args) {
		DemoImpl obj = new DemoImpl();
		obj.show();
	}

}
