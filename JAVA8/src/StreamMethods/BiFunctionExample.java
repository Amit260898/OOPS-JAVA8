package StreamMethods;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BiFunctionExample implements BiFunction<List<Integer>, List<Integer>,List<Integer>>{

	@Override
	public List<Integer> apply(List<Integer> list1, List<Integer> list2) {
		// TODO Auto-generated method stub
		return Stream.of(list1,list2)
				.flatMap(List::stream)
				.distinct()
				.collect(Collectors.toList());
	}
	public static void main(String[] args) {
		
		BiFunctionExample biFunctionExample=new BiFunctionExample();
		List<Integer> list1=Stream.of(1,3,5,7,9).collect(Collectors.toList());
		List<Integer> list2=Stream.of(11,3,58,7,2).collect(Collectors.toList());
		System.out.println("Traditional approach"+biFunctionExample.apply(list1, list2));
		
		//anonymous approach
		
		BiFunction<List<Integer>, List<Integer>, List<Integer>> biFunction1=new BiFunction<List<Integer>, List<Integer>, List<Integer>>() {

			@Override
			public List<Integer> apply(List<Integer> t, List<Integer> u) {
				// TODO Auto-generated method stub
				return Stream.of(list1,list2)
						.flatMap(List::stream)
						.distinct()
						.collect(Collectors.toList());
			}
		};
		
		System.out.println("anonymous impl"+biFunction1.apply(list1, list2));
		
		
		BiFunction<List<Integer>, List<Integer>, List<Integer>> biFunction2=(l1,l2)-> {
			// TODO Auto-generated method stub
			return Stream.of(l1,l2)
					.flatMap(List::stream)
					.distinct()
					.collect(Collectors.toList());
		};
		
		Function<List<Integer>,List<Integer>> sorted=(lists)->lists.stream().sorted().
				collect(Collectors.toList());
		
		System.out.println("lambda aaproach"+biFunction2.andThen(sorted).apply(list1, list2));
		
		
		
		Map<String, Integer> map=new HashMap<>();
		map.put("basant", 5000);
		map.put("sushant", 15000);
		map.put("javed", 12000);
		
		BiFunction<String, Integer, Integer> incrSalaryBiFunction=new BiFunction<String, Integer, Integer>() {

			@Override
			public Integer apply(String key, Integer value) {
				// TODO Auto-generated method stub
				return value+1000;
			}
		};
		
		
		map.replaceAll(incrSalaryBiFunction);
		
		System.out.println(map);
		
		
	BiFunction<String, Integer, Integer> increasdSalaryBiFunction=	(key,value)-> {
			// TODO Auto-generated method stub
			return value+1000;
		};
		
		map.replaceAll(increasdSalaryBiFunction);
		System.out.println(map);
	}
	

}
