package Example;

import java.util.ArrayList;
import java.util.List;

public class Database {
	
	public static List<Employee> getEmployees(){
		
		List<Employee> list=new ArrayList<>();
		
		list.add(new Employee(176,"Amit","IT",65000));
		list.add(new Employee(777,"Sumit","CS",45000));
		list.add(new Employee(178,"Geeta","Mechanical",95000));
		list.add(new Employee(176,"Ajay","Civil",120000));
		list.add(new Employee(176,"Shubhi","Civil",40000));
		
		return list;
	}

}
