package ThreadMethodsAndConstructors;

public class InterruptedDemo extends Thread{
	
	public void run() {
		
		System.out.println(Thread.interrupted());//true->false
		System.out.println(Thread.interrupted());
		//System.out.println(Thread.currentThread().isInterrupted());//true->true
		
		try {
			for(int i=0;i<=5;i++) {
				
				
				System.out.println(i+" "+Thread.currentThread().getName());
				Thread.sleep(1000);
				//System.out.println(Thread.interrupted());
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		InterruptedDemo t1=new InterruptedDemo();
		t1.start();
		
		t1.interrupt();
		
	}

}
