package co.javabasics.exceptionhandling;

public class ExceptionConcept {
	//int a= 10;
	//static ExceptionConcept obj;

	public static void main(String[] args) {
		/*uncaught exceptions
		*int i =9/0;
		*System.out.println(i);
		**/
		
		//caught exception
		//Thread.sleep(2000);
		
		//System.out.println(obj.a);
		
		//1.try catch block
		try {
			int i= 9/0;	//this code gives exception
		}
		catch(Exception e) 	//(Throwable e) (ArithmeticException e)
		{
			//Throwable is super class of Error and Exception
			e.printStackTrace(); 	//what kind of exception
			System.out.println(e.getMessage());
		}
		System.out.println("ABC");

	}

}
