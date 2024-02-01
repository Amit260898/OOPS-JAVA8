package ExtendDemo;

public interface B {
	
	default void greeting() {
		System.out.println("greeting B");
	}
	default void fun() {
		System.out.println("I'm in A");
	}

}
