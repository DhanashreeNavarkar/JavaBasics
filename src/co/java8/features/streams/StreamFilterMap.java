package co.java8.features.streams;

import java.util.Arrays;
import java.util.List;

public class StreamFilterMap {

	public static void main(String[] args) {
		
		List<Customer> customer = Arrays.asList(
				new Customer("Yoo Yeon-seok", 36),
				new Customer("Ji Chang-wook", 33),
				new Customer("Lee Jong-suk", 30),
				new Customer("Kim Soo Hyun", 32)
				);
		
		String  cust = customer.stream()
				.filter(x -> "Kim Soo Hyun".equals(x.getName()))
				.map(Customer :: getName)
				.findAny()
				.orElse(null);
		
		System.out.println(cust);
		
		
		

	}

}
