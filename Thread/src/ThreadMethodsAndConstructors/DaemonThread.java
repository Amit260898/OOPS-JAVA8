package ThreadMethodsAndConstructors;

public class DaemonThread extends Thread{
	
	public void run() {
		//System.out.println(Thread.currentThread().isDaemon());
		System.out.println("child thread"+ Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		
		System.out.println("main thread");
		DaemonThread th1=new DaemonThread();
		th1.setDaemon(true);
		th1.start();
		
	}
}
