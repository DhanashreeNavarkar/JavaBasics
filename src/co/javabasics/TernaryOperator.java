package co.javabasics;

public class TernaryOperator {

	public static void main(String[] args) {
		
		// ternary operator
		// ?:	->	condition?expression1:expression2
		
		int i= 5;
		int j= 2;
		
//		if(i>6)
//			j=1;
//		else 
//			j=10;
//		can be written as fo;;owing using ternary operator

		j = i>6 ? 1 : 10;
		System.out.println(j);
		
	}

}
