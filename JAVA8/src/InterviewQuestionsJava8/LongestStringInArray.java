package InterviewQuestionsJava8;

import java.util.Arrays;

public class LongestStringInArray {
	
	public static void main(String[] args) {
		
		String[] strArray= {"java","techie","springboot","microservices"};
		
		String longestRepeating=Arrays.stream(strArray).reduce((word1,word2)->word1.length()>word2.length() ? word1:word2)
		.get();
		
		System.out.println(longestRepeating);
	}

}
