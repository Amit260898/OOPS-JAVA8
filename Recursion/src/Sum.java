
public class Sum {
	
	public static void main(String[] args) {
		
		System.out.println(sumr(5));
	}
static int sumr(int n) {
		
		if(n==1) {
			return 1;
		}
		
		return n+sumr(n-1);
	}

}
