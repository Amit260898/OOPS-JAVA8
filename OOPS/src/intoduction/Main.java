package intoduction;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
	
		Student[] student=new Student[5];
		
		Student amit=new Student();
		System.out.println(amit);
		System.out.println(amit.rno);
		System.out.println(amit.name);
		System.out.println(amit.marks);
				
		System.out.println(Arrays.toString(student));
	}

}

