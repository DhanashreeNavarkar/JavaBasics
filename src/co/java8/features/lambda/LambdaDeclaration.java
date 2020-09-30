package co.java8.features.lambda;

public class LambdaDeclaration {

	public static void main(String[] args) {
		
		// -> lambda
		
		//before lambda
		/*
		 * WebPage w1 = new WebPage() {
			
			@Override
			public void header(String value) {
				System.out.println("Hey!!! "+value);
			}
		};
		
		 */
		
		//after lambda
		
		WebPage w1 = (value, age) -> { System.out.println("Hi!!! "+value+" Age:"+age); };
		//WebPage w2 = (value, age) -> { System.out.println(value.length()+ " Age"+age); };
		//WebPage w3 = (n, inifinite) -> { System.out.println(n.toUpperCase()+" Infinte: "+inifinite); };
		
//		WebPage w2 = new WebPage() {
//			
//			@Override
//			public void header(String value) {
//				System.out.println("Hey!!! "+value);
//			}
//		};
		
		w1.header("Google", 20);
		//w2.header("Facebook", 122);
		//w3.header("Bharat Mata Ki Jai", 0);

	}

}
