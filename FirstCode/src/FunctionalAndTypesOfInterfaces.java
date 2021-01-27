// Types of interfaces

// 1. Normal interface
// 2. Single abstract method interface --> Functional interface --> Lambda expression --> Scala
// 3. Marker interface (having no method)  // use case is Seriazlization 
// Serializable interface is a empty or marker intreface

@FunctionalInterface
interface Abc{
	void show();
}

public class FunctionalAndTypesOfInterfaces {
	
	public static void main(String[] args) {
		Abc obj = () -> System.out.println("I am the bext");
		obj.show();
	}

}
