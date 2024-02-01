package StreamMethods;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExample implements BiConsumer<String, Integer>{

	@Override
	public void accept(String i1, Integer i2) {
		// TODO Auto-generated method stub
		System.out.println("input 1 "+i1+"input 2"+i2);
		
	}
	
	public static void main(String[] args) {
		
		BiConsumer<String, Integer> biConsumer=new BiConsumerExample();
		biConsumer.accept("JavaTechie", 53000);
		
		BiConsumer<String, Integer> biConsumer1=new BiConsumer<String, Integer>() {

			@Override
			public void accept(String i1, Integer i2) {
				// TODO Auto-generated method stub
				System.out.println("input 1 "+i1+"input 2"+i2);
				
			}
		};
		biConsumer1.accept("Amit", 24);
		
		BiConsumer<String, Integer> biConsumer2=(i1,i2)->System.out.println(i1+ i2);
		biConsumer2.accept("Sumit", 19);
		
		
		Map<String, Integer> map=new HashMap<>();
		map.put("basant", 5000);
		map.put("sushant", 15000);
		map.put("javed", 12000);
		
		map.forEach(biConsumer2);
		map.forEach((k,v)->System.out.println(k+ " "+v));
	}
	
	

}
