package InterviewQuestionsJava8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateCount {
	
	public static void main(String[] args) {
		
		String str="amitsahu";
		
		Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().filter(e->e.getValue()>1).forEach(System.out::println);
		Map<Character, Integer> map=new HashMap<>();
		
		char[] ch=str.toCharArray();
		
		for(char c:ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		
		for(Map.Entry<Character,Integer> entry: map.entrySet()) {
			if(entry.getValue()>1) {
				
				System.out.println(entry.getKey()+ " "+entry.getValue());
			}
		}
	}

}
