package InterviewQuestionsJava8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighestNumber {
	
	public static void main(String[] args) {
		
		int[] numbers= {5,9,11,2,8,21,1};
		
		Integer secondHighest = Arrays.stream(numbers).boxed().sorted(Collections.reverseOrder())
		.skip(1).findFirst().get();
		 Arrays.stream(numbers).boxed().distinct().sorted(Collections.reverseOrder())
				.skip(1).limit(1).forEach(System.out::println);
		
		System.out.println(secondHighest);
	}

}