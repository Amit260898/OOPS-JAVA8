package Inheritance;

public class Main {
	
	public static void main(String[] args) {
		
		Box box1=new Box(4.4,6.7,1.2);
		Box box2=new Box(box1);
		
		System.out.println(box1.l+" "+box1.w+" "+box1.h);
		
		BoxWeight box3=new BoxWeight(1);
		System.out.println(box3.weight+ " "+ box3.h);
		
		Box box5=new BoxWeight(2,3,4,8);
		System.out.println(box5);
		
		B objB=new B();
	System.out.println(objB.n);	
		
	}

}
