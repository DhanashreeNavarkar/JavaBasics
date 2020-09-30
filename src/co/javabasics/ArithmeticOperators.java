package co.javabasics;

public class ArithmeticOperators {

	public static void main(String[] args) {

		/*
		 * Arithmetic (+, -, /, %, *)
		 * Bitwise (<< >> )
		 * Logical ()
		 * Relational ()
		 */
		ArithmeticOperators o = new ArithmeticOperators();
		o.arithmetic(66, 23);
		
	}
	
	public void arithmetic(int m, int n) {
		int r1 = m+n;					//n++ , n=m+n, n += 5
		int r2 = m-n;
		int r3 = m*n;
		double r4 = (double) m/n;
		int r5 = m%n;
		System.out.println("Arithmetic: ");
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
	}
	
	public void bitwise() {
		
	}

}
