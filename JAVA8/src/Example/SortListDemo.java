package Example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListDemo {
	
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(3);
		list.add(7);
		list.add(15);
		
		Collections.sort(list);
		System.out.println(list); 
		
		
		List<Employee> employees=Database.getEmployees();
	
		//employees.stream().sorted((o1,o2)->(int)(o1.getSalary()-o2.getSalary())).forEach(System.out::println);
//		Collections.sort(employees,(o1,o2)->(int) (o1.getSalary()-o2.getSalary()));
//		System.out.println(employees);
//		employees.stream().sorted((o1,o2)->o1.getSalary()-o2.getSalary()).forEach();
		employees.stream().sorted(Comparator.comparing(Employee::getDept).reversed()).forEach((e)->System.out.println());
		
		//Collections.sort(employees,(o1,o2)->(int)(o1.getSalary()-o2.getSalary()));
//		System.out.println(employees);
		
//		employees.stream().sorted((o1,o2)->(int)(o1.getSalary()-o2.getSalary())).forEach(System.out::println);
		
		employees.stream().sorted(Comparator.comparing(emp-> emp.getSalary())).forEach(System.out::println);
//		employees.stream().sorted(Comparator.comparing(Employee::getDept).reversed()).forEach(System.out::println);
//		Collections.sort(list);
//		Collections.reverse(list);
//		System.out.println(list);
//		
		list.stream().sorted().forEach(s->System.out.println(s));
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		//list.stream().sorted().forEach(System.out::println);
	}

}
