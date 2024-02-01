package Example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class SortMapDemo {
	
	public static void main(String[] args) {
		
		Map<String, Integer> map=new HashMap<>();
		map.put("eight",8);
		map.put("four",4);
		map.put("ten",10);
		map.put("two",3);
		
//		List<Entry<String, Integer>> entries=new ArrayList<>(map.entrySet());
//		
//		Collections.sort(entries,(o1,o2)->o1.getKey().compareTo(o2.getKey()));
//		
//		for(Entry<String, Integer> entry:entries) {
//			
//			System.out.println(entry.getKey()+ " "+ entry.getValue());
//		}
		
		map.entrySet().stream().sorted((o1,o2)->o1.getKey().compareTo(o2.getKey())).forEach(System.out::println);
//		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
//		System.out.println("******************");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		Map<Employee,Integer> empMap=new TreeMap<>((o1,o2)->(int)(o1.getSalary()-o2.getSalary()));
		
		empMap.put(new Employee(176,"Amit","IT",65000),65);
		empMap.put(new Employee(170,"Sumit","CIVIL",95000),95);
		empMap.put(new Employee(376,"Geeta","Core",120000),120);
		empMap.put(new Employee(306,"Ajay","MECHANICAL",40000),40);
		
		System.out.println(empMap);
		
		empMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDept).reversed())).forEach(System.out::println);;
		
		empMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDept).reversed())).forEach(System.out::println);;
	}

}
