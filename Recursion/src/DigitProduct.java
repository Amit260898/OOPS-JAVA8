
public class DigitProduct {
	
public static void main(String[] args) {
		
		System.out.println(pDigit(25));
		
	}
	
	static int pDigit(int n) {
		
		if(n%10==n) {
			return n;
		}
		return n%10 * pDigit(n/10);
		
	}

}
