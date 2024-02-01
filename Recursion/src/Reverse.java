
public class Reverse {
	public static void main(String[] args) {
//		rev(1234);
//		System.out.println(sum);
		System.out.println(rev2(1234));
	}
	
	static int sum=0;
	static void rev(int n) {
		
		if(n==0) {
			return;
		}
		
		int rem=n%10;
		sum=sum*10+rem;
		rev(n/10);
	}
	
	static int rev2(int n) {
		
		//sometimes you might need some additional variables in arguments ,
		//in that case use helper function
		
		int digits=(int)(Math.log10(n))+1;
		return helper(n,digits);
		
		
	}

	private static int helper(int n, int digits) {
		// TODO Auto-generated method stub
		
		if(n%10==n) {
			
			return n;
		}
		
		int rem=n%10;
		return rem*(int)(Math.pow(10, digits-1))+helper(n/10, digits-1);
		
	}

}
