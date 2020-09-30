package co.javabasics.oops2.inheritance;

public class Student extends College{
	
	//multi-level inhertance college and university
	
	public void name() {
		System.out.println("Dhanashree");
	}
	
	@Override
	public void semester() {
		System.out.println("7");
	}
	
	@Override
	public void cgpi() {
		System.out.println("7.52");
	}
	
}
