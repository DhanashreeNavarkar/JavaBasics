package co.javabasics.oops2.abstraction;

public class Circle extends Shape{

	@Override
	void area() {
		float c= 4f;
		float s ;
		s= (float) (3.14*c*c);
		System.out.println("Area: "+s);
		
	}
	
	public void perimeter() {
		float r = 4f;
		float s;
		s = (float) (2*3.14*r);
		System.out.println("Perimeter: "+s);
	}


}
