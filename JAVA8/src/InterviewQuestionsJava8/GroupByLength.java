package InterviewQuestionsJava8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLength {
	
	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("Apple","Banana","Mango");
		
		 Map<Integer, List<String>> collect = list.stream().collect(Collectors.groupingBy(String::length));
	
		 System.out.println(collect);
		 
		 list.stream().collect(Collectors.groupingBy(String::length)).entrySet().forEach(System.out::println);
	}

}
