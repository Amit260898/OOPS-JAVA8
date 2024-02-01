package Functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FP01 {
	
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,3,5,6,7);
//		list.stream().forEach(System.out::println);
		boolean match=list.stream().allMatch(i->i%2!=0);
		
		list.stream().filter(i->i%2!=0).map(i->i*i).forEach(System.out::println);
	Integer mulInteger=	list.stream().reduce(1,(a,b)->a*b);
	System.out.println(mulInteger);
		List<String> list1=List.of("Ami","Sumit","Ajay","Geeta","Spring boot","Spring");
		//list1.stream().forEach(System.out::println);
		list1.stream().filter(i->i.startsWith("Spring")).collect(Collectors.toList());
	
		List<String> collect = list1.stream().filter(i->i.startsWith("Spring")).collect(Collectors.toList());
	System.out.println(collect);
	List<String> collect2 = list1.stream().filter(i->i.length()>=4).collect(Collectors.toList());
	System.out.println(collect2);
	
	//squares
	//list.stream().mapToInt(i->i*i).forEach(System.out::println);
	//list.stream().filter(i->i%2!=0).map(i->i*i*i).forEach(System.out::println);
	//list.stream().map(i->i*i).forEach(System.out::println);
	
	list1.stream().map(i->i+" "+ i.length()).forEach(System.out::println);
	}

}
