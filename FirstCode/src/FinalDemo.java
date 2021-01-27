
// We can use final with
// 1. with variables
// 2. methods
// 3. classes

// for variables final is same as const in javascript
// for methods the final keyword make methds not overridable
// for class final keyword make class not inheritab;e

// no one is able to inheriti this calss
final class Hero{
	
}

class Ba{
	// no one cann override this method
	public final void show() {
		
	}
}

class Ch extends Ba{
	
	// see on sid e its red means error in eclipse only
//	@Override
//	public void show() {
//		
//	}
}

public class FinalDemo {
	
	public static void main(String[] args) {
		final double PI = 3.14;
		
		final int DAY;
		DAY = 25;

		
	}

}
