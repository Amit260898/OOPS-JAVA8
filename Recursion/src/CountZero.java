
public class CountZero {
	public static void main(String[] args) {
		System.out.println(countZ(10383020));
		
	}
	
	static int countZ(int n) {
		
		return helper(n,0);
		
		
	}

	private static int helper(int n, int c) {
		// TODO Auto-generated method stub
		if(n==0) {
			return c;
		}
		int rem=n%10;
		if(rem==0) {
			return helper(n/10, c+1);
		}
		return helper(n/10, c);
	}

}
