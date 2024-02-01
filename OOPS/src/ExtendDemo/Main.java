package ExtendDemo;

public class Main implements A,B{



	@Override
	public void fun() {
		// TODO Auto-generated method stub
		A.super.fun();
		B.super.fun();
	}

	@Override
	public void greeting() {
		// TODO Auto-generated method stub
		B.super.greeting();
	}
	

	

}
