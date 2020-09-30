package co.javabasics.oops2.abstraction;

public abstract class Bank {
	
	int  amt =100;
	final int rate= 10;
	static int loanRate= 5;
	
	//abstraction means hiding implementation logic
	//abstraction has partial abstraction
	//abstraction can have abstract and non abstract method
	//interface has 100% abstraction
	
	//one abstract method i.e. no body
	public abstract void loan();
	
	//non abstract method
	public void credit() {
		System.out.println("Bank Credit!!!");
	}
	public void debit() {
		System.out.println("Bank debit!!!");
	}

}
