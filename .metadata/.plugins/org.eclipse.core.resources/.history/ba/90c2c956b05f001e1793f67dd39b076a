package ThreadMethodsAndConstructors;

public class ThreadPriority extends Thread{
	
	public void run() {
		//System.out.println(Thread.currentThread().isDaemon());
		System.out.println("child thread"+ Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		
		System.out.println("main thread priority "+ Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(MAX_PRIORITY);
		System.out.println("main thread new priority "+ Thread.currentThread().getPriority());
		ThreadPriority th1=new ThreadPriority();
		th1.setDaemon(true);
		th1.start();
		
	}

}
