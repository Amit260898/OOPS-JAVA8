package InterviewQuestionsJava8;

import java.util.Stack;

public class ValidParenthesis {
	
	public static void main(String[] args) {
		
		String s = "()[]{}";
		
		System.out.println(valid(s));
	}
	
	static boolean valid(String s) {
		
		Stack<Character> st=new Stack<>();
		
		for(int i=0;i<s.length();i++) {
			
			char ch=s.charAt(i);
			
			if(ch=='(' || ch=='[' ||ch=='{') {
			
				st.push(ch);
				}
			else if (ch==')') {
				if (st.size()==0) return false;
				else if (st.peek()!='(') return false;
				else st.pop();
								
			}
			else if (ch==']') {
				if (st.size()==0) return false;
				else if (st.peek()!='[') return false;
				else st.pop();
								
			}
			else if (ch=='}') {
				if (st.size()==0) return false;
				else if (st.peek()!='{') return false;
				else st.pop();
								
			}
			}
		if(st.size()!=0) return false;
		else return true;
				
		}
	}


