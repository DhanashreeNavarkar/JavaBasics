package co.javabasics.oops2.inheritance;

public class Car extends Vehicle{
	
	//when same method is present in child and parent class with same name and number of arguments, it is called method overriding
	
	public void start() {
		System.out.println("Car start!!!");
	}
	public void stop() {
		System.out.println("Car stop!!!");
	}
	public void refuel() {
		System.out.println("Car refuel!!!");
	}

}
