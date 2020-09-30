package co.javabasics.oops1;

public class WrapperClass {

	public static void main(String[] args) {
		String x = "100";
		System.out.println(x+20); //string concatenation it will give 10020
		
		//data conversion String to int:
		int i = Integer.parseInt(x);
		System.out.println(i);
		System.out.println(i+30);
		
		//Wrapper class: Integer, Double, Boolean
		//we do not have parse for character
		double d = Double.parseDouble(x);
		System.out.println(d);
		
		String k = "true";
		boolean b= Boolean.parseBoolean(k);
		System.out.println(b);
		
		//int to string
		int f = 244;
		System.out.println(f+15);
		
		String s = String.valueOf(f);
		System.out.println(s+20);
		
		String u ="100AB";
		int a= Integer.parseInt(u); //java.lang.NumberFormatException
		

	}

}
