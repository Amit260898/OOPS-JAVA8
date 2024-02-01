package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class CollectionLinkedList {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList<>();
		al.add(100);
		al.add(150);
		al.add(0, 21);
		System.out.println(al);
		
		
	//linked list has 2 constructors, Empty constructors, 2 with collection as argument
	LinkedList l1=new LinkedList(al);
	l1.add(100);
	l1.add(300);
	l1.add(102.4);
	l1.add("ami");
	l1.add('c');
	l1.remove();
	System.out.println(l1);
	l1.add(0, 99);
	
	l1.removeFirst();
	System.out.println(l1);
	System.out.println(l1.getFirst());
	
	}
}