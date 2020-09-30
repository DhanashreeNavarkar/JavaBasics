package co.javabasics.exceptionhandling;

public class ThrowKeyword {

	public static void main(String[] args)  {
		
		//throw keyword is used inside a function.
		//It is used when it is required to throw an Exception logically.
		
		System.out.println("ABC");
		
		try{
			throw new Exception("DSN Exception");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("PQR");
		
		String ExecFlag = " ";
		if (ExecFlag.equals(" ")) {
			try {
			throw new Exception("Exec flag is no");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}
