package Singeltonn;

public class NestedSingelton {
	
	private static class Nested{
		
		static NestedSingelton Instance=new NestedSingelton();
	}
	
	private NestedSingelton() {
		System.out.println("objectMade");
	}
	
	public static NestedSingelton getInstance() {
		
		return	Nested.Instance;
	}

}
