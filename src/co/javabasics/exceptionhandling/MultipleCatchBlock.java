package co.javabasics.exceptionhandling;

public class MultipleCatchBlock {

	public static void main(String[] args) {

		try {
			int a[] = new int[5];
			//ArithmeticException
			//a[5] = 30/0;			
			//ArrayIndexOutOfBoundsException
			//System.out.println(a[10]);		
			String s = null;
			System.out.println(s.length());
			
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds Exception");
		}
		catch (Exception e) {
			System.out.println("Exception Occurs");
		}
		finally {
			System.out.println("Finally block");
		}
		
		
	}

}
