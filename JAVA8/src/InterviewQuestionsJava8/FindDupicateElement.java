package InterviewQuestionsJava8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDupicateElement {
	
	public static void main(String[] args) {
		
		String str="amitisagoodboy";
		
		Set<String> set=new HashSet<>();

		Arrays.stream(str.split("")).filter(s->!set.add(s)).forEach(System.out::println);
		
		Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().filter(map->map.getValue()>1).forEach(System.out::println);
		
		Arrays.stream(str.split(""))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().filter(x->x.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
		  
		List<String> collect = Arrays.stream(str.split(""))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().filter(x->x.getValue()>1).map(Map.Entry::getKey)
		.collect(Collectors.toList()); 
		
		
		//find unique
		List<String> unique = Arrays.stream(str.split(""))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().filter(x->x.getValue()==1).map(Map.Entry::getKey)
		.collect(Collectors.toList());
		
		
		System.out.println(unique+" unique");
		System.out.println();
		
		System.out.println(collect);
		
		char[] ch=str.toCharArray();
		
		Map<Character, Integer> map=new HashMap<>();
		
		for (char c : ch) {
				if(map.containsKey(c)) {
					map.put(c, map.get(c)+1);
				}else {
					map.put(c, 1);
				}
			
		}
		
		for(Map.Entry<Character,Integer> entry:map.entrySet()) {
			
			if(entry.getValue()>1) {
				
				System.out.println(entry.getKey()+ "== " +entry.getValue());
			}
			
		}
		
	}
	
	

}
