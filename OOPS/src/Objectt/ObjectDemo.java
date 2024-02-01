package Objectt;

public class ObjectDemo {

	int num;
	
	
	public ObjectDemo(int num) {
		super();
		this.num = num;
	}

	@Override
	public String toString() {
		return "ObjectDemo [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	public static void main(String[] args) {
		
		ObjectDemo objectDemo=new ObjectDemo(34);
		System.out.println(objectDemo.hashCode());
	}
	

}
