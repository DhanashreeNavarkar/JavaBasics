package co.java8.features.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorInterfaceInterfaceConcept {

	public static void main(String[] args) {
		
		/*
		 * Represents an operation on a single operand/argument that produces a result of the same type as its operand.
		 *  This is a specialization of Function for the case where the operand and result are of the same type.
		 */
		
		UnaryOperator<Integer> func = x-> x*7;
		int n = func.apply(56);
		System.out.println(n);
		
		Function<Integer, Integer> func2 = x-> x*8;
		int m = func2.apply(23);
		System.out.println(m);
		
		List<String> list = new ArrayList<String>();
		list.add("Python");
		list.add("Ruby");
		list.add("C sharp");
		list.add("Java");
		System.out.println(list);
		
		list.replaceAll(ele -> ele + " Language");		//replace is Unary Operator	
		
		System.out.println(list);

	}

}
