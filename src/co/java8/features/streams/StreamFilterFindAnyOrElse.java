package co.java8.features.streams;

import java.util.Arrays;
import java.util.List;

public class StreamFilterFindAnyOrElse {

	public static void main(String[] args) {
		
		//list of customer objects
		
		List<Customer> customer = Arrays.asList(
				new Customer("Yoo Yeon-seok", 36),
				new Customer("Ji Chang-wook", 33),
				new Customer("Lee Jong-suk", 30),
				new Customer("Kim Soo Hyun", 32)
				);
		
		//Find the value
		Customer cust = customer.stream()									//convert list to stream
		.filter(x -> "Ji Chang-wook".equals(x.getName()))					//filter it for Ji Chang-wook
		.findAny()															//if it finds then return
		.orElse(null);
		
		System.out.println(cust.getName()+" - "+cust.getAge());
		System.out.println("****************************************************************************************");
		
		// Do not find value
		Customer cust1 = customer.stream()									//convert list to stream
				.filter(x -> "Dhanashree".equals(x.getName()))					//filter it for Ji Chang-wook
				.findAny()															//if it finds then return
				.orElse(null);
				
		System.out.println(cust1);
		System.out.println("****************************************************************************************");
				
		//Filter on multiple conditions
		Customer cust2 = customer.stream()
				.filter((x) -> "Yoo Yeon-seok".equals(x.getName()) && 36 == x.getAge())
				.findAny()
				.orElse(null);
		
		System.out.println(cust2.getName()+" - "+cust2.getAge());
		System.out.println("****************************************************************************************");
		
		

	}

}
