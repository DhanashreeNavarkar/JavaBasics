package co.javabasics.exceptionhandling;

import java.util.Scanner;

public class UserDefined {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		int i = sc.nextInt();
		System.out.println("Age is: "+i);
		
		
		try {
		if(i<18) {
			throw new MyException("You cannot vote");
			
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

	
}





class MyException extends Exception{
	
	public MyException(String msg) {
		
		super(msg);
	}
	
}









