
interface WithVariable{
	// variables in interfcaes are by default final
	int i = 10;
	
	static void show() {
		System.out.println("Hello eveyoe wiithout any obj or class impl"
				+ " "
				+ "I am simply from interface only");
	}
	
}


public class StaticAndFinalVariablesInInterface {
	
	public static void main(String[] args) {
		System.out.println("Hello everyone");
		WithVariable.show();
	}

}
