package co.javabasics.oops1;

public class JavaFunctions {

	public static void main(String[] args) {
		JavaFunctions jf = new JavaFunctions();
		//copy of all non-static method will be given to new JavaFunctions() object
		jf.test();
		System.out.println(jf.run());
		System.out.println(jf.qa());
		System.out.println(jf.division(10, 5));
	}
	
	//non static functions
	// void means it should not return any value  
	public void test() {
		System.out.println("Test method");
	}
	
	public int run() {
		System.out.println("Run method");
		int a=10, b=20;
		int c= a+b;
		return c;
	}
	
	public String qa() {
		System.out.println("QA method");
		String s ="Selenium";
		return s;
	}
	//x,y - input parameters/arguments
	public int division(int x, int y) {
		System.out.println("Division method");
		int d=x/y;
		return d;
	}

}
