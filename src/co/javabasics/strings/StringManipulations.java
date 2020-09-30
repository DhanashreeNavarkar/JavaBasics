package co.javabasics.strings;

public class StringManipulations {

	public static void main(String[] args) {
		String str1= "Rock";
		String str2= "Star";
		
		String str3= str1.concat(str2);
		System.out.println("Concatenation: "+str3);
		
		System.out.println("Length of string: "+str3.length());
		
		System.out.println("Index of character: "+str3.indexOf('S'));
		System.out.println("Character at position: "+str3.charAt(0));
		
		System.out.println("Compare To 'ROCKSTAR': "+str3.compareTo("rockstar"));
		System.out.println("Compare To 'ROCKSTAR' - Case Ignored: "+str3.compareToIgnoreCase("ROCKSTAR"));
		
		System.out.println("Contains: "+str3.contains("St"));
		
		System.out.println("String Ends With: "+str3.endsWith("r"));
		
		System.out.println("String lowe case: "+str3.toLowerCase());
		System.out.println("String upper case: "+str3.toUpperCase());

	}

}
