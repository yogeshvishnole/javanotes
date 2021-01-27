
abstract class Human{
	abstract void  eat();
	void walk() {
		
	}
	
}

// any class which has one abstarct method has to be made abstarct
// it is not necessary to have abstratc method n our abstract class
// one cannot make the objects of abstract class
// child class of abstract class must have to implement the abstract methods of the 
//abstract class

class Men extends Human{
	void eat() {
		
	}
	// we can override walk as well
}



public class AbstractClass {
	
	//  real example of abstract class is Number class
	// which is extended by Integer class
//	and Float ,Double etc;
	// We can make reference of Abstract class;
	
	public static void main(String[] args) {
		Number i;
		
		i = 5;
		i = 5.5;
	}
	
	
	

}
