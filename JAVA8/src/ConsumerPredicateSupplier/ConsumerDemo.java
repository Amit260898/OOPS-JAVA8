package ConsumerPredicateSupplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		// TODO Auto-generated method stub
		System.out.println("printing :"+t);
		
	}
	
	public static void main(String[] args) {
		
		//Consumer consumer=(t)->System.out.println("printing :"+ t); 
		
		//consumer.accept(10);
		
		List<Integer> list1=Arrays.asList(1,2,3,4,5);
		
//		list1.stream().forEach(consumer);
		list1.stream().forEach((t)->System.out.println("printing :"+ t));
	}

}
