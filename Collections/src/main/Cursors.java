package main;



import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Cursors {
	public static void main(String[] args) {
		
		List l=new ArrayList();
		l.add(10);
		l.add("amit");
		l.add("sumit");
		
		Iterator iterator=l.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		iterator.remove();
		System.out.println(l);
//		
		ListIterator listIterator=l.listIterator(l.size());
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
			
		}
		
		listIterator.set(200);
		listIterator.add(20);
		
	
		System.out.println(l);
		
		Vector v=new Vector<>();
		
		v.add(10);
		v.add("amit");
		v.add(15.2);
		
		Enumeration e=v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
	}
	
	
	

}
