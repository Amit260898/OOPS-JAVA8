package MapAndReduce;



public class MapReduceEx {
	
	public static void main(String[] args) {
		
		
		//getEmployee whose grade is A and x
		//getSalary
	double averageSalary=EmployeeDataBase.getEmployees().stream()
		.filter(employee->employee.getGrade().equals("A"))
		.map(employee-> employee.getSalary())
		.mapToDouble(i->i)
		.average().getAsDouble();
	
	System.out.println(averageSalary);
	
	double sumSalary=EmployeeDataBase.getEmployees().stream()
			.filter(employee->employee.getGrade().equals("A"))
			.map(employee-> employee.getSalary())
			.mapToDouble(i->i).reduce(0, (a,b)->a+b);
		
		System.out.println(sumSalary);
		double sumSalary2=EmployeeDataBase.getEmployees().stream()
				.filter(employee->employee.getGrade().equals("A"))
				.map(employee-> employee.getSalary())
				.mapToDouble(i->i).sum();
		System.out.println(sumSalary2);
		
	double maxSalary=EmployeeDataBase.getEmployees().stream()
			.filter(employee->employee.getGrade().equals("A"))
			.map(employee->employee.getSalary()).mapToDouble(i->i).max().getAsDouble();
	System.out.println(maxSalary);
		
	
		
		
	
	}

}
