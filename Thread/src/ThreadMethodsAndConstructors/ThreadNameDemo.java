package ThreadMethodsAndConstructors;

public class ThreadNameDemo extends Thread{
	
	public void run() {
		
		System.out.println("This thread is executed by "+ Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		
		System.out.println("hwllo is printed by "+ Thread.currentThread().getName());	
		ThreadNameDemo th1=new ThreadNameDemo();
		th1.start();
		ThreadNameDemo th2=new ThreadNameDemo();
		th2.start();
		System.out.println(th1.isAlive());
	}

	
}

