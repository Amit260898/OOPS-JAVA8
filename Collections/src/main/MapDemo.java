package main;

import java.util.HashMap;
import java.util.Map;

import javax.management.MalformedObjectNameException;

public class MapDemo {
	
	public static void main(String[] args) {
		
		Map map=new HashMap<>();
		map.put(101, "Amit");
		map.put(102, "Sumit");
		map.put(103, "Ajay");
		map.put(102, "");
		map.put(null, null);
		map.put(null, "aaa");
		
		System.out.println(map.containsKey(101));
		map.entrySet();
		
		//map.remove(101);
		map.replace(102, "ravi");
		System.out.println(map.size());
		
		System.out.println(map);
		
	}

}
