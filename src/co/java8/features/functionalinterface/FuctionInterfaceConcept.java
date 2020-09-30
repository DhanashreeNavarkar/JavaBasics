package co.java8.features.functionalinterface;

import java.util.function.Function;

public class FuctionInterfaceConcept {

	public static void main(String[] args) {
		
		/*
		 * Interface Function<T,R> Type parameterS:
		 * T- Type of input to
		 * the Function R - type of result of function
		 * only one method apply
		 */

		Function<String, Integer> func = x -> x.length();
		int len = func.apply("This is java 8");						 
		
		System.out.println(len);
		
		//chaining function
		
		Function<Integer, Integer> func2 = x -> (x * 2);
		
		int result = func.andThen(func2).apply("I am still learning");
		System.out.println(result);
		
		
		
		
	}

}
