package InterviewQuestionsJava8;

import java.util.Arrays;

public class ReverseWordByWord {
	
	public static void main(String[] args) {
		
		String str="Welcome to CloudTech";
		
		
		String[] st=str.split(" ");
		String result="";
		
		for(int i=st.length-1;i>=0;i--) {
			
			if(i==0) {
				result=result+st[i];
			}else {
				result=result+st[i]+" ";
			}
		}
		System.out.println(result);
	}

}