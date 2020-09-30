package co.javabasics.constructor;

public class ConstructorChaining {
	
	public String name;
	public int age;
	
	public ConstructorChaining() {
		this("Madhusudan");
	}
	

	public ConstructorChaining(String sname) {
		this(sname, 4);
		
	}


	public ConstructorChaining(String sname, int sage) {
		this.name = sname;
		this.age = sage;
	}
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}


	public static void main(String[] args) {

		ConstructorChaining cc = new ConstructorChaining();
		cc.display();
		
	}

}
