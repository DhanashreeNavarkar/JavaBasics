package co.javabasics.oops1;

public class MethodOverload {

	public static void main(String[] args) {
		
		MethodOverload mo = new MethodOverload();
		mo.sum();
		mo.sum(10);
		mo.sum(10, 5);

	}
	
	//we can overload main method
	public void main(int p) {
		
	}
	
	//method overloading - when method name is same, with different arguments or input parameters with different data types within the class
	//cannot create method inside a method
	//duplicate mths i.e.same method name with same no of param is not allowed
	
	public void sum() {
		System.out.println("Sum method - zero param ");
	}
	
	public void sum(int i) {
		System.out.println("Sum method - one param: different int type ");
		System.out.println(i);
	}
	
	public void sum(double i) {
		System.out.println("Sum method - one param: different double type ");
		System.out.println(i);
	}

	
	public void sum(int i, int j) {
		System.out.println("Sum method - two param ");
		System.out.println(i+j);
	}

}
