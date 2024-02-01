package InterviewQuestionsJava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FetchCommonElements {
	
	public static void main(String[] args) {
		
		int[] arr1= {2,3,4,5};
		int[] arr2= {2,7,1,5};
		fetchCommon(arr1,arr2);
	}
	
	public static void fetchCommon(int[] arr1, int[] arr2) {
		
		Arrays.stream(arr1).boxed().distinct().collect(Collectors.toList());
		
		List<Integer> common =Arrays.stream(arr1).filter(numbers->Arrays.stream(arr2)
				.anyMatch(arr2Number->arr2Number==numbers)).boxed().collect(Collectors.toList());
		
		System.out.println(common);
	}

}
