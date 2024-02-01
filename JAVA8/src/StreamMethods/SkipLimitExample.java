package StreamMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SkipLimitExample {
	
	public static void main(String[] args) {
//		
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		numbers.stream().sorted().skip(numbers.size()-3).limit(1).forEach(System.out::println);
		
//		List<Integer> numbers1=new ArrayList<>();
//		System.out.println(numbers1.get(0));
	}

}
