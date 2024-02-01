package Singeltonn;

public class Main {
	
	public static void main(String[] args) {
		
		Singelton obj1=Singelton.getInstance();
		Singelton obj2=Singelton.getInstance();
		
		NestedSingelton obj3=NestedSingelton.getInstance();
		NestedSingelton obj4=NestedSingelton.getInstance();
		
		
	}

}
