package co.javabasics.oops2.interfaces;

public class HDFCBank implements USBank, BrazilBank{
	
	//if a class is implementing any interface it is mandatory to define/override all methods in child
	
	//overriding from USbank
	@Override
	public void create() {
		System.out.println("HDFC Credit!!!");
		
	}

	@Override
	public void debit() {
		System.out.println("HDFC Debit!!!");
		
	}

	@Override
	public void transferMoney() {
		System.out.println("HDFC Transfer Money!!!");
		
	}
	
	//HDFC bank methods
	public void eduLoan() {
		System.out.println("HDFC Education Loan!!!");
	}
	
	public void carLoan() {
		System.out.println("HDFC Car Loan!!!");
	}
	
	//Override from Brazil bank
	@Override
	public void mutualFund() {
		System.out.println("HDFC Mutual Fund!!!");
		
	}
	
	

}
