



public class BoxingDemo {
	
	public static void main(String[] args) {
		
		// primitives
		int  i = 5;
		
		// object oriented version of primitives
		// Integer and other primitve equivalent classes are called 
		// Wrapper classes because they wrap the primitves
		Integer ii = new Integer(5); // Boxing in general - Wrapping in java
		
		int j = ii.intValue(); // unboxing - unwrapping
		
		
		Integer iii = i; // Auto boxing
		int jj = iii ;// Auto  unboxing 
		
		
		String str = "123";
		
		int k = Integer.parseInt(str);
		
		
		// where boxing used they are used by some frameworks there we have to use boxing
		
		// using primitives gives fater code a compare to wrapper classes
		
	}

}
