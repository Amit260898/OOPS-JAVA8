package Example;


import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


public class EmpCount {
	
	
	
	public static void main(String[] args) {
		
	List<Employee> empList=	Database.getEmployees();
	
	empList.stream()
	.collect(Collectors.groupingBy(e->e.getDept(),Collectors.counting()))
	.entrySet().forEach(System.out::println);

	
	empList
	.stream()
	.collect(Collectors.groupingBy(e -> e.getDept(), Collectors.counting()))
	.entrySet().forEach(System.out::println);
	
	 

	
	

	
	}

}