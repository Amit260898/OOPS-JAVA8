package ThreadJoin;

public class Medical extends Thread{
	
	public void run() {
		
		try {
			System.out.println("medical starts");
			Thread.sleep(1000);
			System.out.println("medical ends");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}