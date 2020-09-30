package co.javabasics.oops1;

public class StaticNonStatic {
	
	String name = "TOM"; //non static global variable
	static int age = 25; //static global variable

	public static void main(String[] args) {
		
		/* how to call static variable and method
		 * 1.direct calling: sum()
		 * 2.calling by classname: StaticNonStatic.sum()
		 */
		sum();
		StaticNonStatic.sum();
		
		System.out.println(age);
		System.out.println(StaticNonStatic.age);
		
		//how to call non static methods and variables: create object
		StaticNonStatic ss = new StaticNonStatic();
		System.out.println(ss.name);
		ss.sendMail();
		
		//can i access static  using object reference? yes, but not a good practice
		ss.sum();	//warning will be given

	}
	
	public void sendMail() {
		System.out.println("Send mail: Non static method");
	}
	
	public static void sum() {
		System.out.println("Sum: Static method");
	}

}
