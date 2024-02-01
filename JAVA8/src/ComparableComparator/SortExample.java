package ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;

public class SortExample {
	
	public static void main(String[] args) {
		
		ArrayList<Student> students=new ArrayList<>();
		students.add(new Student(18,"Sumit","Delhi"));
		students.add(new Student(12,"Amit","Allahabad"));
		
		students.add(new Student(9,"Ajay","Prayagraj"));
		
		System.out.println(students);
		
		Collections.sort(students,new IdComparator());
		System.out.println(students);
		
	
		ArrayList<Student> students1=new ArrayList<>();
		students1.add(new Student(18,"Sumit","Delhi"));
		students1.add(new Student(12,"Amit","Allahabad"));
		
		students1.add(new Student(9,"Ajay","Prayagraj"));
		
		Collections.sort(students1,new NameComparator());
		System.out.println(students1);
	}

}
