package AbstractDEMO;

public class Son extends Parent{
	
	 public Son(int age) {
		// TODO Auto-generated constructor stub
		 super(age);
		
	}
	 
	 

	@Override
	void normal() {
		// TODO Auto-generated method stub
		super.normal();
	}



	@Override
	void career() {
		// TODO Auto-generated method stub
		System.out.println("I'm going to be a engineer");
		
	}

	@Override
	void partner() {
		// TODO Auto-generated method stub
		System.out.println("I love AB she's 23");
		
	}

}
