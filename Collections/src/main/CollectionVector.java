package main;

import java.util.Vector;

public class CollectionVector {
	public static void main(String[] args) {
		
	
	Vector vector=new Vector<>(); //initial capacity 10
	
	vector.add(20);
	vector.add(1,"rahul");
	vector.add(null);
	vector.add(null);
	vector.addElement("amit");
	vector.addElement("sumt");
	vector.addElement("jmit");
	vector.addElement("amit");
	vector.addElement("amit");
	vector.addElement("amit");
	vector.addElement("amit");
	vector.addElement("amit");
	vector.addElement("g");
	vector.addElement("amit");
	vector.setElementAt("aaa", 2);
	
	//vector.removeElementAt(2);
	System.out.println(vector);
System.out.println(vector.firstElement());
System.out.println(vector.removeElement(null));
System.out.println(vector.capacity());
	}
}
