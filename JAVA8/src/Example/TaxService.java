package Example;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {
	
	public List<Employee> evaluateTaxUsers(String input){
		
		if(input.equalsIgnoreCase("tax")) {
	return	Database.getEmployees().stream().filter(emp->emp.getSalary()>=50000).collect(Collectors.toList());
	}else {
		return	Database.getEmployees().stream().filter(emp->emp.getSalary()<50000).collect(Collectors.toList());
	}
	}
	
	public static void main(String[] args) {
		
		System.out.println(new TaxService().evaluateTaxUsers("tax"));
		System.out.println(new TaxService().evaluateTaxUsers("non tax"));
		
	}

}
