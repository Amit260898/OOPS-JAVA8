package InterviewQuestionsJava8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Pract {
	
	public static void main(String[] args) {
		
		String str="ilovejavatechie";
		
//		Map<String, Long> collect = Arrays.stream(str.split(""))
//				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		
//		System.out.println(collect);
//		
//		Map<Character,Integer> map=new HashMap<>();
//		char[] ch=str.toCharArray();
//		for(char c:ch) {
//			if(map.containsKey(c)) {
//				map.put(c, map.get(c)+1);
//			} else {
//				map.put(c, 1);
//			}
//		}
//		System.out.println(map);
		
		List<String>collect = Arrays.stream(str.split(""))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().filter(e->e.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println(collect);
	}

}
