




public class TryCatchFinally {

	public static void main(String[] args) {
		
	

		
		try {
			// statement that can throw an exception
			int i = 10;
			int j = 0;
			double k = i/j;
			System.out.println("Output is " + k);
		}catch(ArithmeticException e) {
			System.err.println("Error" + e);
		}finally {
			System.out.println("We are done");
		}
		
		// ArithmeticException child of RuntimeException child of Exception class in java
		
		

	}

}
