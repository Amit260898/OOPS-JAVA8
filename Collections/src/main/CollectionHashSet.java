package main;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionHashSet {

	public static void main(String[] args) {
		
		ArrayList aList=new ArrayList<>();
		aList.add("amit");
		aList.add("deepak");
		HashSet set=new HashSet<>();
		set.addAll(aList);
		set.add(10);
		set.add("Amit");
		set.add(10.45);
		set.add('a');
		set.add(null);
		
		System.out.println(set);
		
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(set.contains("Amit"));
		System.out.println(set.size());
		set.clear();
	}
}
