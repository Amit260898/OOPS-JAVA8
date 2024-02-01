package MapAndFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceExample {
	
	public static void main(String[] args) {
		
		List<Integer> numbers=Arrays.asList(3,7,2,8,5,9);
		
		
		
		int sum1=numbers.stream().mapToInt(i->i).sum();
		
		System.out.println(sum1);
		
		Integer reduceSum = numbers.stream().reduce(0,(a,b)->a+b);
		
		System.out.println(reduceSum);
		
		Optional<Integer> reduceSumMethodReference = numbers.stream().reduce(Integer:: sum);
		System.out.println(reduceSumMethodReference.get());
		
		Integer mulResult = numbers.stream().reduce(1,(a,b)->a*b);
		
		System.out.println(mulResult);
		
		Integer max=numbers.stream().reduce(0,(a,b)->a>b? a : b);
		System.out.println(max);
		Integer maxWithMethodReference=numbers.stream().reduce(Integer::max).get();
		System.out.println(maxWithMethodReference);
		
		
		//find maximum occuring character in list of string
		List<String> words=Arrays.asList("coreJava","spring","hibernate");
		
		String longestString = words.stream().reduce((word1,word2)->word1.length()>word2.length()?word1 : word2).get();
		System.out.println(longestString);
	}

}
