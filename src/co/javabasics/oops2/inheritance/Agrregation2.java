package co.javabasics.oops2.inheritance;

public class Agrregation2 {
	
	int id;
	Aggregation1 a;
	
	
	public Agrregation2(int e_id, Aggregation1 ag) {
		this.id = e_id;
		this.a =ag;
		
	}
	
	
	public void display() {
		System.out.println("Id: "+id);
		System.out.println("First Name: "+a.first);
		System.out.println("Last Name: "+a.last);
	}

}
