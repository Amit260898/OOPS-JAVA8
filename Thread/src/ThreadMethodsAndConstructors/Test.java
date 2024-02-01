package ThreadMethodsAndConstructors;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Amit");
		System.out.println(Thread.currentThread().getName());
	}

}
