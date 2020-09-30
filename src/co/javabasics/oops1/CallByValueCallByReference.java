package co.javabasics.oops1;

public class CallByValueCallByReference {
	
	int p , q;

	public static void main(String[] args) {
		CallByValueCallByReference vr = new CallByValueCallByReference();
		int x=20;
		int y=24;
		int w= vr.testSun(x, y);	//call by value or pass by value
		System.out.println(w);
		
		vr.p= 50;
		vr.q= 60;
		
		vr.swap(vr);
		//after swap : call by reference
		System.out.println(vr.p);
		System.out.println(vr.q);
		

	}
	
	public int testSun(int a, int b) {
		//a=30;
		//b=40;
		int c= a+b;
		return c;
	}
	
	//call by ref
	public void swap(CallByValueCallByReference t) {
		int temp;
		temp = t.p; 	//temp = 50
		t.p=t.q;		//t.p= 60
		t.q = temp;		//t.q= 50
		
	}

}
