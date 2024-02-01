package Comparing;

public class Student implements Comparable<Student>{
	
	int rno;
	float marks;
	public Student(int rno, float marks) {
		super();
		this.rno = rno;
		this.marks = marks;
	}
	
	

@Override
	public String toString() {
		return "Student [marks=" + marks + "]";
	}


	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		int diff=(int) (this.marks-o.marks);
		return diff;
	}
	
	

}
