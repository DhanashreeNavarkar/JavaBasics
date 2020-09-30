package co.javabasics.strings;

public class StringBufferConcept {

	public static void main(String[] args) {

		/*
		 * String buffer ->
		 * used to create mutable string i.e., memory allocated to string is not fixed
		 * it is synchronous in nature i.e., thread safe
		 *  default size is = 16
		 *  can be accessed by multiple threads at time
		 *  it is slower compared to string Builder
		 */
		
		StringBuffer s = new StringBuffer("Welcome World!!!");
		s.append("Whatsapp");
		System.out.println(s.length());
		System.out.println(s);
		
		s.insert(24, '!');
		System.out.println(s);
		
		System.out.println("Capacity: "+s.capacity());
		System.out.println("Reverse: "+s.reverse());
		
		System.out.println("************************************************************************************************");
		
		String str = "Welcome World!!!Whatsapp!";
		System.out.println(str.length());
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		String str1 = "Hey World!!!";
		System.out.println(str1.equals(str));
		System.out.println(str1.charAt(6));
		System.out.println(str1.toCharArray());
		System.out.println(str.concat(str1));
	

	}

}
