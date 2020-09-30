package co.javabasics.strings;

public class StringConcatenation {

	public static void main(String[] args) {
		int a =100, b= 200;
		double c=12.33;
		double d=10.33;
		String x= "Hello";
		String y= "World";
		System.out.println(a+b);		// "+"- String concatenation operator
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);	//Left to right gets executed
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+b);
		System.out.println(x+y+c+d);
		System.out.println(c+d+x+y);

	}

}
