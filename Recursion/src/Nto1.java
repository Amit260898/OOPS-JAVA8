
public class Nto1 {
	
	public static void main(String[] args) {
		
//		nToOne(5);
//		nToOneRev(5);
		both(5);
	}
	
	static void nToOne(int n) {
		if(n<1) {
			
			return;
		}
		System.out.println(n);
		nToOne(n-1);
	}
	
	static void nToOneRev(int n) {
		if(n<1) {
			
			return;
		}
		
		nToOneRev(n-1);
		System.out.println(n);
	}
	
	static void both(int n) {
		if(n<1) {
			return;
		}
		System.out.println(n);
		both(n-1);
		System.out.println(n);
		
	}

}
