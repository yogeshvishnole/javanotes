class Calc{
	
	// Here n is variable length argument it is an array
	
	// varargs is always the last parameter of the function
	
	public int add(int ... n) {
		int sum = 0;
		for(int num:n) {
			sum+=num;
		}
		return sum;
	}
	
	
}


public class varArgsDemo {
	
	public static void main(String[] args) {
		Calc obj = new Calc();
		System.out.println(obj.add(1,2,3,4));
	}

}
