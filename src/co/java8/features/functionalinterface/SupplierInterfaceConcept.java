package co.java8.features.functionalinterface;

import java.util.function.Supplier;

public class SupplierInterfaceConcept {

	public static void main(String[] args) {
		
		/*
		 * takes no arguments and returns a result
		 * Represents a supplier of results.
		 * There is no requirement that a new or distinct result be returned each time the supplier is invoked.
		 */
		
		getText(() -> "Java");			//zero argument
		getText(() -> "Sarang");
		
	}
	
	public static void getText(Supplier<String> text) {
		System.out.println(text.get().length());
		System.out.println(text.get());
	}
	

}
