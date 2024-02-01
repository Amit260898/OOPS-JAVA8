package ThreadJoin;

public class OfficerSign extends Thread{
	
	public void run() {
		
		try {
			System.out.println("officer sign starts");
			Thread.sleep(1000);
			System.out.println("officer sign ends");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
