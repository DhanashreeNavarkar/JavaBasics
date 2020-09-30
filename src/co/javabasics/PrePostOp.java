package co.javabasics;

public class PrePostOp {
	
	public static void main(String args[]) {
		
		int i = 1;
		System.out.println(i);
		int j = i++;	//post increment
		
		System.out.println(i);
		System.out.println(j);
		
		int a = 2;
		System.out.println(a);
		int b = ++a;	//pre increment
		System.out.println(a);
		System.out.println(b);
		
		int m= 2;
		System.out.println(m);
		int n = m--;
		System.out.println(m);
		System.out.println(n);
		
		int u= 2;
		System.out.println(u);
		int v = m--;
		System.out.println(u);
		System.out.println(v);
	}

}
