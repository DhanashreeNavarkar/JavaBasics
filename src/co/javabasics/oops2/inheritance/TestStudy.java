package co.javabasics.oops2.inheritance;

public class TestStudy {

	public static void main(String[] args) {
		
		University u = new University();
		u.criteria();
		u.register();
		u.uni();
		System.out.println("********************************************************************************");

		College c = new College();
		c.subjects();
		c.semester();
		c.cgpi();
		c.uni();
		c.criteria();
		System.out.println("********************************************************************************");
		
		Student s = new Student();
		s.name();
		s.semester();
		s.cgpi();

	}

}
