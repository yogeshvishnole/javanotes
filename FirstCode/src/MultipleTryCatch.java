





public class MultipleTryCatch {

	public static void main(String[] args) {
		
		
		try {
			int i = 10;
			int j = 0;
			int k = i/j;
			
			int A[] = new int[10];
			
//			int f = A[12];
			
			int a[] = null;
			int m = a[1];	
			
		}catch(ArithmeticException e) {
			System.err.println("Error" + e);
			
		}catch(ArrayIndexOutOfBoundsException  | NullPointerException n) {

		System.out.println("Error" + n);
		}catch(Exception e) {
			System.out.println("Error" + e);
		}
		
		System.out.println("Hello from outside");

	}

}







