package co.javabasics.oops2.interfaces;

public class Student implements College, University{
	
	private String name;
	private int id;

	@Override
	public void sem() {

		System.out.println("There are total 8 semesters");
	}

	@Override
	public void uni() {

		System.out.println("Mumbai University");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
