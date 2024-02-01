package ThreadMethodsAndConstructors;

public class YieldDemo extends Thread{
	
	public void run() {
		try {
			Thread.yield();
			for(int i=0;i<=5;i++) {
				
				
				System.out.println(i+" "+Thread.currentThread().getName());
				
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
	
	
	public static void main(String[] args) {
		
		YieldDemo t1=new YieldDemo();
		t1.start();
		
		
		
			for(int i=0;i<=5;i++) {
				
				
				System.out.println(i+" "+Thread.currentThread().getName());
				
			}
		
		
		
		
		
	}	

}
