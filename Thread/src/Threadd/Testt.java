package Threadd;

public class Testt implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread task runnable");
		
	}
	
	public static void main(String[] args) {
		
		Testt tt=new Testt();
		Thread th=new Thread(tt);
		th.start();
	}

}