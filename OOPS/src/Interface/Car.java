package Interface;

public class Car implements Engine, Break,Media{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("I start Engine like a normal car");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("I stop Engine like a normal car");
		
	}

	@Override
	public void acc() {
		// TODO Auto-generated method stub
		System.out.println("I accelerate Engine like a normal car");
		
	}

	@Override
	public void breake() {
		// TODO Auto-generated method stub
		System.out.println("I breake like a normal car");
		
	}

}
