package InterviewQuestionsJava8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingElement {
	
	public static void main(String[] args) {
		
		String str="amitmsahu";
	
	
		Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		.entrySet().stream().filter(x->x.getValue()==1)
		.findFirst().get().getKey();
		String key = Arrays.stream(str.split(""))
		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		.entrySet().stream()
		.filter(x->x.getValue()==1)
		.findFirst().get().getKey();
		
		System.out.println(key);
	}

}
