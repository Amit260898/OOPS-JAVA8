
public class SumDigits {
	
	public static void main(String[] args) {
		
		System.out.println(sDigit(1342));
		
	}
	
	static int sDigit(int n) {
		
		if(n==0) {
			return 0;
		}
		return n%10 + sDigit(n/10);
		
	}

}
