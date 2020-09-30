package co.java8.features.functionalinterface;

@FunctionalInterface

public interface Page {
	
	public void greet();		//only one abstract method
	
	//static and default methods are allowed
	public static void test() {
		
	}
	
	default void display() {
		
	}

}
