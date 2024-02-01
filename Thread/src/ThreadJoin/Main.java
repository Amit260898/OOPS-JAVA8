package ThreadJoin;

public class Main {
	
	public static void main(String[] args) throws InterruptedException{
		
		Medical medical=new Medical();
		medical.start();
		
		medical.join();
		
		TestDrive tDrive=new TestDrive();
		tDrive.start();
		
		tDrive.join();
		
		OfficerSign officerSign=new OfficerSign();
		
		officerSign.start();
		
	}

}
