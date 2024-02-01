package Singeltonn;

public class Singelton {
	
	private Singelton() {
		// TODO Auto-generated constructor stub
	}
	
	private static Singelton instance;
	
	public static Singelton getInstance() {
		
		if(instance==null) {
			instance=new Singelton();
		}
		
		return instance;
	}

}
