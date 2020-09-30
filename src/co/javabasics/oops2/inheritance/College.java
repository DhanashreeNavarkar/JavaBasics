package co.javabasics.oops2.inheritance;

public class College extends University{
	
	//single level inheritance from university
	
	public void subjects() {
		System.out.println("There are total 6 subjects");
	}

	
	public void semester() {
		System.out.println("There are total 8 semester");
	}
	
	public void cgpi() {
		System.out.println("Marks calculated");
	}

	@Override
	public void uni() {
		System.out.println("Mumbai University");
	}

}
