package co.javabasics.constructor;

public class C {
	
	public C(int i) {
		System.out.println(i);
	}

	public static void main(String[] args) {
		//C c = new C();	 cannot do this
		C c = new C(10);

	}

}
