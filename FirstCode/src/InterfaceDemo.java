
// What is interface

//interface is same as abstract class in which all the methods are by default
// public abstract.
//one class can implements multiple interfaces means it allow multiple inheritance in java

// genera;lly go with interfaces if you do not have todefine anyy method in the base clas
//  or abstract base class , any case it will be

// In interfaces all classes are public abstract by default

interface Writer{
	void write();
}

// Note very imp point

// Child classes (even child classes of interfaces ) can not reduced 
// the visibilty of methods 

// Visibility order in java

/// public
//  default
// protected 
// private

interface Ink{
	
}

class Play{
	
}

class Pen extends Play implements Writer,Ink{
	public void write() {
		
	}
}

class Pencil implements Writer{
	public void write() {
		
	}
}

class Normal{
	void show() {
		
	}
}

public class InterfaceDemo {
    public static void main(String[] args) {
    	
    	// we can create the refrence of a interface but we can not create the object of 
    	// it.
    	
//    	It is wrong Writer p = new Writer();
    	
    	Writer p = new Pen();
    	Writer pe = new Pencil();    	
    	Normal n = new Normal();
    	n.show();
    }
}
