package ExtendDemo;

public interface A {
	
	default void fun() {
		System.out.println("I'm in A");
	}

	void greeting();
}
