package co.javabasics.oops1;

public class LGVariables {
	
	//Global variables: the scope of global variables will be available across all functions with some condition
	String name = "TOM";
	int age = 25;

	public static void main(String[] args) {
		//main method is a static method
		int i =10; //local variables for main method
		System.out.println(i);
		
		LGVariables lg= new LGVariables();
		
		System.out.println("Calling the global variables");
		System.out.println(lg.name);
		System.out.println(lg.age);
		
		System.out.println("Calling sum method");
		
	}
	
	public void sum() {
		//local variables for sum method
		int i= 15;
		int j= 20;
		int age= 25;
	}

}
