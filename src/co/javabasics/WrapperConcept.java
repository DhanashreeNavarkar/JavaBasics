package co.javabasics;

import java.util.ArrayList;

public class WrapperConcept {

	public static void main(String[] args) {

		//Wrapper classes are used for converting primitive data types into objects, like int to Integer etc.
		//While working with collections in Java, we use generics for type safety like this: ArrayList<Integer>
		//instead of this ArrayList<int>. 
		
		//wrapper classes are built in java classes that converts primitive data types to objects and vice versa
				//the process of converting primitive data types to objects is called auto boxing
				//the process of converting objects to primitive data types is called unboxing
				
		
		
		//Auto boxing and Auto un-boxing concept
		
		//Wrapper classes are used in collections
		
		int i = 5;
		
		Integer ii = new Integer(i);		//boxing
		Integer jj = i;						//unboxing
		
		int j = jj.intValue();				//unboxing
		int k = jj;							//auto unboxing
		
		System.out.println(ii);
		System.out.println(jj);
		System.out.println(j);
		System.out.println(k);
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(34);
		a.add(jj);
		
		System.out.println(a);

	}

}
