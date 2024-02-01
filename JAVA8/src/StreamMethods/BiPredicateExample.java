package StreamMethods;

import java.util.function.BiPredicate;

public class BiPredicateExample {
	
	public static void main(String[] args) {
		
		BiPredicate<String, String> biPredicate=new BiPredicate<String, String>() {

			@Override
			public boolean test(String s1, String s2) {
				// TODO Auto-generated method stub
				return s1.equals(s2);
			}
		};
		
		System.out.println(biPredicate.test("madam", "madam"));
		
		BiPredicate<String, String> biPredicat1=	(s1,s2)-> {
			return s1.equals(s2);
		};
		
		BiPredicate<String, String> lengthPredicate=(s1,s2)->s1.length()==s2.length();
		
		boolean andOutput=lengthPredicate.and(biPredicat1).test("madam","madam");
	System.out.println(biPredicat1.test("madam", "madam"));
	
	boolean orOutput=lengthPredicate.or(biPredicat1).test("madam","madam");
	System.out.println(orOutput);
	}
	
	

}
