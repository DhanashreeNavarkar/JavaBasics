package co.java8.features.streams;

public class Customer {
	
	//POJO - Plain Old Java Object
	
	private String name;
	private int age;
	
	public Customer(String name, int age) {
		this.setName(name);
		this.setAge(age);
		
		//getter and setter
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
