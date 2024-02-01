package intoduction;

import java.util.Iterator;

public class Wrapper {
	
	public static void main(String[] args) {
		
		Integer a=5;
		int aa=a;
		int bb=10;
		Integer b=bb;
		Integer numInteger=new Integer(45);
		
		final A amit =new A("Amit sahu");
		amit.name="other name";
		//when a non primitive is final you cannot reassign
		//amit=new A("abc");
		
		A obj;
		
		for(int i=0;i<10000000;i++) {
			obj=new A("random");
		}
		
	}
	void swap(int a, int b) {
	
	a=a^b;
	b=a^b;
	a=a^b;
	}
	
	
	
			

}

 class A{
	
	final int num=10;
	String name;
	
	public A(String name) {
		
		super();
		
		this.name = name;
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("object is destroyed");
	}
	
}
