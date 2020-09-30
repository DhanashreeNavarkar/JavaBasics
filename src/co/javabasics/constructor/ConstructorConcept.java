package co.javabasics.constructor;

public class ConstructorConcept {
	
	//cannot return value
	//same name as class name
	//Can we overload a constructor ? yes
	public ConstructorConcept() {
		System.out.println("Default constructor!!!!!!!");
	}
	
	public ConstructorConcept(int i) {
		System.out.println("Single parameter: "+i);
		
	} 
	public ConstructorConcept(int i ,int j) {
		System.out.println("First parameter: "+i);
		System.out.println("Second parameter: "+j);
	}
	
	public static void main(String args[]) {
		
		ConstructorConcept cc = new ConstructorConcept();
		ConstructorConcept cc1 = new ConstructorConcept(67);
		ConstructorConcept cc2= new ConstructorConcept(92,10);
		
	}

}
