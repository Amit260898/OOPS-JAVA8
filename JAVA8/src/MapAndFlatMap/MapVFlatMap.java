package MapAndFlatMap;

import java.util.List;
import java.util.stream.Collectors;

public class MapVFlatMap {
	
	public static void main(String[] args) {
		
	

	List<Customer> customers=EkartDatabase.getAll();
	
	//List<Customer> convert List<String>---->data transformation
	//customer.getEmail one-to-one mapping
	List<String> emails=customers.stream().map(customer->customer.getEmail()).collect(Collectors.toList());
	System.out.println(emails);
	
	//customer.getPhoneNumber one-to-many mapping
	List<List<String>> phoneNumbers=customers.stream().map(customer->customer.getPhoneNumbers()).collect(Collectors.toList());
	System.out.println(phoneNumbers);
	
	//mapping customer->phoneNumbers
	List<String> phones=customers.stream()
			.flatMap(customer->customer.getPhoneNumbers().stream())
			.collect(Collectors.toList());
	
	System.out.println(phones);
	}

}