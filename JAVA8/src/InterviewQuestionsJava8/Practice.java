package InterviewQuestionsJava8;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice {
	
	
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,2,3,1,2,7);
		list.add(1, 9);
		System.out.println(list);
		Set<Integer> set=new HashSet<>();
		list.stream().filter(s->!set.add(s)).forEach(System.out::println);
		
		String str="amitisagoodboy";
//		 List<String> collect = Arrays.stream(str.split(""))
//		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//		.entrySet().stream().filter(x->x.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
//		System.out.println(collect);
		
		List<Entry<String, Long>> collect = Arrays.stream(str.split(""))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().filter(x->x.getValue()>1).collect(Collectors.toList());
		System.out.println(collect);
		
//		Map<String, Long> collect = Arrays.stream(str.split(""))
//		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//
//		System.out.println(collect);
		
		int[] numbers= {1,23,11,45,19};
		
		Arrays.stream(numbers).boxed().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
	
		Arrays.stream(numbers).boxed().map(x->x+"").filter(x->x.startsWith("1")).collect(Collectors.toList());
	
		String strr="amitmsahu";
		Arrays.stream(strr.split(""))
		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		.entrySet().stream().filter(x->x.getValue()==1).findFirst().get().getKey();
		System.out.println();
		
	}
	
	static void count(String name) {
		
		Map<Character, Integer> map=new HashMap<>();
		
		char[] ch=name.toCharArray();
		
		for(char c:ch) {
			
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		for(Map.Entry<Character,Integer> entry: map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+ " "+ entry.getValue());
			}
		}
		
		
		
	}
	
}
