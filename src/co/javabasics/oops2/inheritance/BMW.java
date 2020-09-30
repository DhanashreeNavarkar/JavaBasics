package co.javabasics.oops2.inheritance;

//has-a relationship

public class BMW extends Car{
	
	//when same method is present in child and parent class with same name and number of arguments, it is called method overriding
	
	public void start () {	//overridden method
		System.out.println("BMW start!!!");
	}
	public void theftSafety() {
		System.out.println("BMW Theft Safety!!!");
	}

}
