package ThreadMethodsAndConstructors;

public class SleepThread extends Thread{
	
	public void run() {
		

	try {
		for(int i=0;i<=5;i++) {
			Thread.sleep(1000);
			System.out.println(i);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}
	
	public static void main(String[] args) {
		SleepThread th=new SleepThread();
		
		th.start();
	}

}
