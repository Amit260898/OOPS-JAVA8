
public class Fibonacci {
	
	public static void main(String[] args) {
		
		System.out.println(fibo(4));
		System.out.println(fiboFormula(34));
	}
	
	static long fiboFormula(long num) {
		
		return (long)(Math.pow(((1+Math.sqrt(5))/2), num)/Math.sqrt(5));
	}
	
	static int fibo(int n) {
		
		//base condn
		if(n<2) {
			return n;
		}
		
		return fibo(n-1)+ fibo(n-2);
	}

}
