// We start  with very basic single or multi level inheritance
// Here we have  context that we can not access the pre defined functionality thats
// for reuse of pre defined classes we make use of inheritance

// Due to mabiguity problem java does  not support multiple inhertitance

class Calculator{
	public int add(int i,int j){
		return i+j;
	}
}

class CalcAdv extends Calculator{
	public int sub(int i, int j) {
		return i-j;
	}
}


class CalcVeryAdv extends CalcAdv{
	public int multi(int i, int j) {
		return i*j;
	}
}

public class InheritanceDemo {
    public static void main(String[] args) {
    	Calculator calc = new Calculator();
    	
    	System.out.println(calc.add(5, 0));
    	
    	CalcAdv calcAdv = new CalcAdv();
    	System.out.println(calcAdv.sub(5, 2));
    	
    	CalcVeryAdv calcVeryAdv = new CalcVeryAdv();
    	System.out.println(calcVeryAdv.sub(5, 2));
    }
}
