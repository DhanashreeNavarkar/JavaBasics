package co.javabasics.strings;

public class ReverseString {

	public static void main(String[] args) {

		//there is no reverse() is not available because string is immutable
		
		//1. using for loop
		String str= "Selenium";
		System.out.println(str);
		int len = str.length();
		System.out.println("Length: "+len);
		
		String rev = "";
		
		for(int i =len-1 ; i>=0 ;i--) {
			rev =rev +  str.charAt(i);
		}
		
		System.out.println("Reverse using for loop: "+rev);
		
		StringBuffer s = new StringBuffer(str);
		System.out.println("Using string Buffer: "+s.reverse());
	}

}
