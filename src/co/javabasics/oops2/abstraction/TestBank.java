package co.javabasics.oops2.abstraction;

public class TestBank {

	public static void main(String[] args) {
		HDFCBank hb = new HDFCBank();
		hb.loan();		//overridden method
		hb.credit();
		hb.debit();
		hb.funds();		//non overridden method
		
		//dynamic polymaorphism
		Bank b = new HDFCBank();
		b.loan();
		b.credit();
		b.debit();
		
		System.out.println("Amount: "+Bank.loanRate);
		
		
		//Bank b1 = new Bank(); we cannot create object of abstract and interface class
		
		
		

	}

}
