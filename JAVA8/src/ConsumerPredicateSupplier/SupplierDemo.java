package ConsumerPredicateSupplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {


	public static void main(String[] args) {
		
		Supplier<String> supplier=()->"hi amit";
		
		//System.out.println(supplier.get());
		
		List<String> list1=Arrays.asList();
		
		//System.out.println(list1.stream().findAny().orElseGet(supplier));
		System.out.println(list1.stream().findAny().orElseGet(()->"hi amit"));
	}
	

}
