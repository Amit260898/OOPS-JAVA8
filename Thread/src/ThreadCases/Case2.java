package ThreadCases;

//performing single task from multiple thread
public class Case2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("task");
		
	}
	
	public static void main(String[] args) {
		
		
		Case2 t1=new Case2();
		Thread th1=new Thread(t1);
		th1.start();
		
		Thread th2=new Thread(t1);
		th2.start();
		
		
		

	}

}
