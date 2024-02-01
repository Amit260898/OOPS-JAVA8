package InterviewQuestionsJava8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachCharacterOccurenceinString {
	
	public static void main(String[] args) {
		
		getCharCount("ilovejavatechie");
		
		String str="ilovejavatechie";
				
		
		
		Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet()
		.forEach(System.out::println);

		String[] result = str.split("");
		
		Map<String, Long> collect = Arrays.stream(result).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect);
		
		
	}
	
	public static void getCharCount(String name) {
		
		Map<Character, Integer> map=new HashMap<>();
		
		char[] ch=name.toCharArray();
		
		for(char c:ch) {
			if(!String.valueOf(c).isBlank()) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
			}
		}
		
		System.out.println(name+"map"+map);
		
	}

}
