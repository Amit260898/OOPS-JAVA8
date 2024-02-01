package AbstractDEMO;

public class Main {
	
	public static void main(String[] args) {
		Son son=new Son(23);
		son.career();
		son.normal();
		
		Parent.abc();
		
		Daughter daughter=new Daughter(24);
		daughter.career();
		System.out.println(daughter.age);
	}

}
