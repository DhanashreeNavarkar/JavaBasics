package co.javabasics.strings;

public class StringBuilderConcept {

	public static void main(String[] args) {

		/*
		 * String builder ->
		 * used to create mutable string i.e., memory allocated to string is not fixed
		 * it is not synchronous in nature i.e., it is not thread safe
		 * hence it is faster
		 * default size is = 16
		 * can be accessed by single thread at a time
		 */
		
		StringBuilder s = new StringBuilder("Welcome World!!!Whatsapp!");
		System.out.println(s);
		System.out.println(s.length());
		
		s.delete(1, 5);
		System.out.println(s);
		
		s.append("facebook");
		System.out.println(s);
		
		System.out.println(s.capacity());
		System.out.println(s.reverse());

	}

}
