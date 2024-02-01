package main;

import java.util.Stack;

public class CollectionStack {

	public static void main(String[] args) {
		
		Stack s=new Stack<>();
		
		s.push("amit");
		s.push("sumit");
		s.push(100);
		s.push(200);
		
		System.out.println(s);
		System.out.println(s.search("amit"));
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.peek());
		
		System.out.println(s.empty());
		
	}
}
