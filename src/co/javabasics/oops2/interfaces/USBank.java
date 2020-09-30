package co.javabasics.oops2.interfaces;

public interface USBank {
	
	//interface we can declare the variables and variables are by default static as well as final and we cannot change value of vars
	//no static method in interface
	//no main method
	// cannot create object of interface
	//Interface abstract in nature
	int min_bal= 100;
	
	//interface only has method prototype i.e. only declaration, no method body
	
	public void create();
	public void debit();
	public void transferMoney();
	
	

}
