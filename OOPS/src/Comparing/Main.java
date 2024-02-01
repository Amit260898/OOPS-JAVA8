package Comparing;

public class Main {
	
	public static void main(String[] args) {
		
		Student amit=new Student(1, 87.5f);
		Student sumit=new Student(2, 80.5f);
		
		if(amit.compareTo(sumit)<0) {
			
			System.out.println("amit has more marks");
		}
	}

}
