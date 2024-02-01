package InterviewQuestionsJava8;


import java.util.Arrays;
import java.util.List;

public class StringJoin {
	
	public static void main(String[] args) {
		
		List<String> noS = Arrays.asList("1","2","3","4");
		
		String results=String.join("-",noS );
		
		System.out.println(results);
		
		
	}

}
