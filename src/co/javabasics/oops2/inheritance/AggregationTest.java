package co.javabasics.oops2.inheritance;

public class AggregationTest {

	public static void main(String[] args) {
		/*
		 * Aggregation -> it is  has-a relation
		 * if class has entity reference it is called Aggregation
		 * 
		 * A "department" in College has "professors". 
		 * If College does not have "department", it still has "professors"
		 * hence professor and department has-a loosely coupled relation. This loosely coupled relation is called Aggregation
		 */
		
		Aggregation1 a1 = new Aggregation1("Sneha", "Lata");

		Agrregation2 a2 = new Agrregation2(3, a1);
		a2.display();

	}

}
