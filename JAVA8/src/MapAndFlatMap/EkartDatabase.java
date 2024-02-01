package MapAndFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDatabase {
	
	public static List<Customer> getAll(){
		
		return Stream.of(
				new Customer(101,"John","john@gmail.com",Arrays.asList("976788987","8896156895")),
				new Customer(102,"Aohn","aohn@gmail.com",Arrays.asList("8876788997","467398030")),
				new Customer(103,"Rohan","rohan@gmail.com",Arrays.asList("6376788987")),
				new Customer(104,"Jerin","jerin@gmail.com",Arrays.asList("5576788987"))
								
				).collect(Collectors.toList());
	}

}
