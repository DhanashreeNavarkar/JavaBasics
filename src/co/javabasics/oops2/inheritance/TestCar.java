package co.javabasics.oops2.inheritance;

public class TestCar {
	
	//when same method is present in child and parent class with same name and number of arguments, it is called method overriding
	//static polymorphism -- compile time polymorphism

	public static void main(String[] args) {
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine(); 	//superclass vehicle method is called
		System.out.println("**********");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		System.out.println("**********");
		
		//child class can be referred by parent class, it is known as dynamic or runtime polymorphism
		//only overridden methods and parent class methods can be used during dynamic polymorphism
		//Top casting
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		

		Vehicle v = new BMW();
		v.engine();
		
		//Down Casting not allowed - child cannot refer parent
		// it gives error while runtime
		System.out.println("**********"); 
		BMW b1 = (BMW) new Car(); //java.lang.ClassCastException
		
		

	}

}
