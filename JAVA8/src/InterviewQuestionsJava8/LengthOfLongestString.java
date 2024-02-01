package InterviewQuestionsJava8;

import java.util.Arrays;

public class LengthOfLongestString {
	
	public static void main(String[] args) {
		String[] strArray= {"java","techie","springboot","microservices"};
		
		int maxLength=Arrays.stream(strArray).mapToInt(String::length).max().orElse(0);
		System.out.println(maxLength);
		
		
	}

}
