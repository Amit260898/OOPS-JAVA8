package main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.imageio.metadata.IIOInvalidTreeException;

public class MapHashMap {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> hm =new HashMap<>();
		
		hm.put(101, "Amit");
		hm.put(102, "Sumit");
		hm.put(103, "Namit");
		hm.put(104, "Ramit");
		hm.get(102);
		
		System.out.println(hm);
		hm.remove(101);
		System.out.println(hm.containsKey(102));
		System.out.println(hm.containsValue("Amit"));
		System.out.println(hm.get(104));
		hm.replace(102, "aaa");
		System.out.println(hm.size());
		
//		Set set=hm.entrySet();
//		System.out.println(set);
//		Iterator itr= set.iterator();
//		while(itr.hasNext()) {
//			//System.out.println(itr.next());
//			Map.Entry entry=(Map.Entry) itr.next();
//			System.out.println(entry.getKey()+"-> "+entry.getValue());
//		}
		
		for(Map.Entry me:hm.entrySet()) {
			
			System.out.println(me.getKey()+" -> "+me.getValue());
		}
		
		
		
		
	}

}
