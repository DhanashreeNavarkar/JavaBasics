package co.javabasics.oops2.interfaces;

public class TestBank {

	public static void main(String[] args) {
		
		// USBank us = new USBank(); cannot create object because it is interface
		//is-a relationship
		//we are achieving multiple inheritance
		
		System.out.println(USBank.min_bal);
		//USBank.min_bal =200;  cannot be changed because it is final/static/ constant in nature
		HDFCBank hb = new HDFCBank();
		hb.create();
		hb.debit();
		hb.transferMoney();
		hb.eduLoan();
		hb.carLoan();
		hb.mutualFund();
		
		//dynamic polymorphism- child class can be referred by Interface reference var
		
		USBank b = new HDFCBank();
		b.create();
		b.debit();
		b.transferMoney();
		//b.eduLoan(); cannot create because it belongs to HDFC not USBank
		//b.carLoan();
		

	}

}
