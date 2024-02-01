package Lambda;

public interface Calculator {
	
	default void switchOn() {
		System.out.println("amit");
	}
	
//	void sum(int input);
	
	int subtract(int a, int b);

}


