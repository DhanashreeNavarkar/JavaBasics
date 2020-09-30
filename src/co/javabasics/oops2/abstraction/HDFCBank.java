package co.javabasics.oops2.abstraction;

public class HDFCBank extends Bank{

	@Override
	//from bank class we do not need to inherit 
	public void loan() {
		System.out.println("HDFC loan !!!!");
	}
	
	//it is not necessary to inherit credit, debit method
	//abstraction means hiding some logic
	
	public void funds() {
		System.out.println("HDFC Funds!!!!!!!");
	}

}
