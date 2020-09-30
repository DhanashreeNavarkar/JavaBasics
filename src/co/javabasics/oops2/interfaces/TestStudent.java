package co.javabasics.oops2.interfaces;

public class TestStudent {

	public static void main(String[] args) {

		Student s = new Student();
		s.setName("Dhanashree");
		System.out.println(s.getName());
		s.setId(34);
		System.out.println(s.getId());
		
		System.out.println("*************************************");
		s.sem();
		s.uni();

	}

}
