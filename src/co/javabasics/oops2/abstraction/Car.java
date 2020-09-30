package co.javabasics.oops2.abstraction;

public interface Car {
	//ony final and static variable
	final int wheels = 4;
	
	
	//always define only abstract method
	//no method body
	//only method declaration
	//we achieve 100% abstraction
	 public void start();
	 public void stop();
	 public void refuel();
	 
		

}
