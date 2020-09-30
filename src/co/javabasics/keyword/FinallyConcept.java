package co.javabasics.keyword;

public class FinallyConcept {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
		

	}
	
	public static void test1() {
		try{
			System.out.println("Inside test 1 method---!!!");
			throw new RuntimeException("test");
			
		}  
		catch(Exception e) {
			System.out.println("Inside catch block---!!!");
		}
		
		finally {
			System.out.println("Inside finally block---!!!");
		}
	}
	
	public static void test2() {
		try{
			System.out.println("Inside test 2 method---!!!");
			
		}
		
		finally {
			System.out.println("Inside 2nd finally block---!!!");
		}
	}
	
	public static void test3() {
		
		int i=10;
		try{
			System.out.println("Inside test 3 method---!!!");
			int k = i/0;
		}  
		/*
		 * catch(ArithmeticException e) {
		 * System.out.println("Inside catch block---!!!");
		 * System.out.println("Divide by zero error !!!");
		 * }
		*/
		catch(NullPointerException e) { //wrong exception so not catched
			 System.out.println("Inside catch block---!!!");
			 System.out.println("Divide by zero error !!!");
			 }
		
		finally {
			System.out.println("Will be executed even with exception---!!!");
		}
	}
	

}
