package StreamMethods;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;


public class ForEachDemo {
	
	//filter->  conditional check
	
	public static void main(String[] args) {
		
		List<String> li=new ArrayList<>();
		li.add("Amit");
		li.add("Sumit");
		li.add("Namit");
		li.add("Nit");
		
		for (String st : li) {
			if(st.startsWith("N")) {
			System.out.println(st);
			}
		
	}
	//	li.stream().forEach((t)->System.out.println(t));
		li.stream().filter((t)->t.startsWith("N")).forEach((t)->System.out.println(t));
		
		Map<Integer, String> map=new HashMap<>();
		
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		
//		for(Map.Entry entry:map.entrySet()) {
//			
//			System.out.println(entry.getKey());
//			
//		}
		
//		map.forEach((key,value)->System.out.println(key+ " "+ value));
//		map.entrySet().stream().forEach(obj-> System.out.println(obj));
		map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(obj-> System.out.println(obj));
	
		
		//internal working of forEach method
//		Consumer<String> consumer=(t)->System.out.println(t);
//		
//		for(String s1:li) {
//			consumer.accept(s1);
//		}
		
	}	
	
	
	
	
			

}
