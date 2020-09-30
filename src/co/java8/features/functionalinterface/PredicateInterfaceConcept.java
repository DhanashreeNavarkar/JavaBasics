package co.java8.features.functionalinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PredicateInterfaceConcept {

	public static void main(String[] args) {

		/*
		 * 	Represents a predicate (boolean-valued function) of one argument
		 */
		
		Predicate<Integer> func = x -> x>5;
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
		
		List<Integer> colList= list.stream().filter(func).collect(Collectors.toList());
		System.out.println(colList);
		
		List<Integer> colList1= list.stream().filter(x -> x>5 && x<9).collect(Collectors.toList());
		System.out.println(colList1);
		
		//predicate with negate() :
		
		List<String> list1 = Arrays.asList("DSN","DS","DN","AJAX","AJA","AJ","A");
		
		Predicate<String> nameExp = x-> x.startsWith("A");
		List <String> newName=list1.stream().filter(nameExp.negate()).collect(Collectors.toList());
		System.out.println(newName);
		
	}

}
