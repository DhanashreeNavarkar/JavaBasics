package co.javabasics.keyword;

public class SuperConcept2 extends SuperConcept1{

	String wheels = "Vehicle has 4 wheels";
	
	public SuperConcept2() {
		System.out.println("This is sub class");
	}
	
	void display() {
		System.out.println("Child: "+wheels);
		System.out.println("Parent: "+super.wheels);
		
	}
	
}
