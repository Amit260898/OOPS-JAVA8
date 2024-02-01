package AbstractDEMO;


public abstract class Parent {
	
	int age;
	
	static void abc() {
		System.out.println("anc");
	}
	
	void normal() {
		System.out.println("in normal parent ");
	}
	
	
	public Parent(int age) {
		super();
		this.age = age;
	}
	abstract void career();
	abstract void partner();

}
