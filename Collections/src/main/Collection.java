package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.LinkedTransferQueue;

public class Collection {
	
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList<>();
		al.add(10);
		al.remove(al);
		System.out.println(al);
		al.add(20);
		al.add(50);
		al.add(80);
		al.add(2,30);
		
		
		
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		ListIterator litrr=al.listIterator(al.size());
		while(litrr.hasPrevious()) {
			System.out.println(litrr.previous());
		}
		
		}

}
