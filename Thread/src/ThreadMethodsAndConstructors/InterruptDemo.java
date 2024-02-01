package ThreadMethodsAndConstructors;

public class InterruptDemo extends Thread{
	
	public void run() {
		try {
			for(int i=0;i<=5;i++) {
				
				
				System.out.println(i+" "+Thread.currentThread().getName());
				Thread.sleep(1000);
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		InterruptDemo t1=new InterruptDemo();
		t1.start();
		
		t1.interrupt();
		
	}

}
