package co.javabasics.constructor;

public class ThisConstructor {
	//global- class var
	String name;
	int age;
	
	public ThisConstructor(String name, int age) {
		//this.global var = local var
		this.name = name;
		this.age = age;
		
		System.out.println(name);	//belongs to mtd
		System.out.println(age);	//belongs to mtd
	}

	public static void main(String[] args) {
		
		ThisConstructor c = new ThisConstructor("TOM", 23);

	}

}
