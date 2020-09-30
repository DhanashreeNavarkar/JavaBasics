package co.java8.features.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpressionAndReferences {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Sanam" , "Teri" , "Kasam");
		
		// 1.Anonymous class
		list.forEach(new Consumer<String>() {
			//Anonymous Class
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
			
		});
		
		System.out.println("**************************************************************************************");
		
		// 2.Lambda expression
		list.forEach(str -> System.out.println(str));
		
		System.out.println("**************************************************************************************");
		
		// 3. Method Reference
		list.forEach(System.out :: println);
		

		System.out.println("*************************************************************************************************");
		for(String t : list) {
			System.out.println(t);
		}
		
	}

}
