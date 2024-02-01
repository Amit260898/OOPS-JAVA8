package MapAndReduce;

import java.util.ArrayList;
import java.util.List;

;

public class EmployeeDataBase {
	
		public static List<Employee> getEmployees(){
		
		List<Employee> list=new ArrayList<>();
		
		list.add(new Employee(176,"Amit","A",65000));
		list.add(new Employee(777,"Sumit","B",45000));
		list.add(new Employee(178,"Geeta","A",95000));
		list.add(new Employee(176,"Ajay","C",120000));
		list.add(new Employee(176,"Shubhi","A",40000));
		
		return list;
	}

}
