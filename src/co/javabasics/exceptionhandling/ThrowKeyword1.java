package co.javabasics.exceptionhandling;

public class ThrowKeyword1 {

	public static void main(String[] args) {

		try {
			int a=50;
			int b=0;
			if(b==0) {
			throw new Exception("New Exception");
			}
			int c = a/b;
			System.out.println(c);
	
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
