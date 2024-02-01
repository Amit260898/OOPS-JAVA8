package ThreadJoin;

public class TestDrive extends Thread{
	
	public void run() {
		
		try {
			System.out.println("Test Drive starts");
			Thread.sleep(1000);
			System.out.println("Test drive ends");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
