package Polymorphism;

public class Main {
	
	public static void main(String[] args) {
		
		Shapes shape=new Shapes();
		shape.area();
		
		Circle circle=new Circle();
		circle.area();
		
		Triangle triangle=new Triangle();
		triangle.area();
		
		Integer a=new Integer(10);
		Integer b=new Integer(10);
		System.out.println(a.equals(b));
		System.out.println(a==b);
	}

}
