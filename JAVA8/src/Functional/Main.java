package Functional;

public class Main {
	
	public static void main(String[] args) {
		
		String string="68121256901";
		if (string.length()==11) {
			string=string.substring(string.length()-5, string.length()-2);
			int val=Integer.parseInt(string);
			if(val%2==0) {
				System.out.println("1"); 
				
			}else {
				System.out.println("2"); 
			}
			
		}
		System.out.println(string);
		
	}

}
