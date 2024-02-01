package InterviewQuestionsJava8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class InPlaceSort {
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		Arrays.stream(arr).boxed().sorted().forEach(System.out::println);
		inPlace(arr);
				}
	static void inPlace(int[] arr) {
		
		IntStream.range(0, arr.length/2).forEach(i->{
		int temp= arr[i];
		
		arr[i]=arr[arr.length-i-1];
		arr[arr.length-i-1]=temp;
		
		
		});
		
		System.out.println(Arrays.toString(arr));
	}

}
