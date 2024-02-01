package Example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Abc {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(7);
		list.add(1,9);
		
		System.out.println(list.size()+""+list);
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
