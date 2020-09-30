package co.javabasics.constructor;

public class B extends A{
	
	public B() {
		//super keyword- want to call parent class constructor
		super();	//does not execute default constructor
		System.out.println("This is child class B!!!");
	}
	
	public B(int i) {
		super(i);	//super is always 1st statement in constructor
	}
	
	public static void main(String args[]) {
		
		B b = new B();
		/* Output:
		 * This is Parent class A!!!
		 * This is child class B!!!
		 * because it will call base class constructor gets called
		 */
		B b1 = new B(12);
	}

}
