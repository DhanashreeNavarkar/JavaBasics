package co.javabasics;

public class TypeCasting {

	public static void main(String[] args) {

		//Implicit conversion
		byte b = 10;
		System.out.println("byte: "+b);
		short s= b;	
		System.out.println("short: "+s);
		int i = s;
		System.out.println("int: "+i);
		long l = i;
		System.out.println("long: "+l);
		float f = l;
		System.out.println("float: "+f);
		double d = f;
		System.out.println("double: "+d);
		char c = 'c';
		int ascii = c;
		System.out.println("Ascii: "+ascii);
		
		//Explicit Conversion
		double dd = 34.89;
		System.out.println("Double: "+dd);
		float ff = (float) dd;
		System.out.println("Float: "+ff);
		
		char cc= (char) ascii;
		System.out.println(cc);

	}

}
