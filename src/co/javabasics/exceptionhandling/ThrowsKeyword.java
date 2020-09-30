package co.javabasics.exceptionhandling;

public class ThrowsKeyword {

	public static void main(String[] args){
		
		//throws keyword is in the function signature i.e used in front of class name. 
		//It is used when the function has some statements that can lead to some exceptions.

		//jvm will accept this exception
		ThrowsKeyword t = new ThrowsKeyword();
		t.sum();
		System.out.println("ABC");

	}
	
	public void sum(){ 	
		try{
			div();
		}
		catch(ArithmeticException e) {
			 	
		}
	}
	
	public void div() throws ArithmeticException{
		int i =9/0;		//exception line
	}

}
