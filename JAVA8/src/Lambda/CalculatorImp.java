package Lambda;



public class CalculatorImp{

	
	
	public static void main(String[] args) {
		
	
//	Calculator calculator=	() ->{
//			// TODO Auto-generated method stub
//			System.out.println("switch is on");
//			
//		};
		
//		Calculator calculator=	() ->System.out.println("switch is on");
//		
//		calculator.switchOn();
		
//		Calculator calculator=(input)->System.out.println("Sum :"+input );
//	
//		calculator.sum(1234);
//		
//		Calculator calculator=(a,b)->{	
//			if(b<a) {
//			
//				throw new RuntimeException("b should be greater than a");
//			}
//			else {
//				return b-a;
//			}
//			
//			
//		};
		
		Calculator calculator=(a,b)->b-a;
		System.out.println(calculator.subtract(8, 20));

	

}
}

//() -> (body);