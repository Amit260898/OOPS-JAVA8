package MapAndReduce;

public class Employee {
	
	private int id;
	private String name;
	private String grade;
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String dept) {
		this.grade = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + grade + ", salary=" + salary + "]";
	}
	public Employee(int id, String name, String grade, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static void getEmployees() {
		// TODO Auto-generated method stub
		
	}
	
	

}
