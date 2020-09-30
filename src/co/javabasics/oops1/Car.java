package co.javabasics.oops1;

public class Car {
	
	//Class variables
	int mod;
	int wheel;

	public static void main(String[] args) {
		
		Car a = new Car();
		// a, b, c are object reference variable
		// new car() - is the object of car class
		Car b = new Car();
		Car c = new Car();
		
		a.mod = 2015;
		a.wheel = 4;
		b.mod = 1995;
		b.wheel = 2;
		c.mod = 1997;
		c.wheel = 8;
		
		//System.out.println(a.mod+a.wheel);
		System.out.println("Before shifting the reference");
		System.out.println(a.mod);
		System.out.println(a.wheel);
		System.out.println(b.mod);
		System.out.println(b.wheel);
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		System.out.println("After shifting the reference");
		a=b;
		b=c;
		c=a;
		System.out.println("Before shifting the reference");
		System.out.println(a.mod);
		System.out.println(a.wheel);
		System.out.println(b.mod);
		System.out.println(b.wheel);
		System.out.println(c.mod);
		System.out.println(c.wheel);
		

	}

}
