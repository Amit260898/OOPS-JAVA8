package Polymorphism;

public class Numbers {
	
	private int num;
	String name;
	int[] arr;
	
	
	
	public int getNum() {
		return num;
	}



	public void setNum(int num) {
		this.num = num;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int[] getArr() {
		return arr;
	}



	public void setArr(int[] arr) {
		this.arr = arr;
	}



	public Numbers(int num, String name, int[] arr) {
		super();
		this.num = num;
		this.name = name;
		this.arr = new int[44];
	}
	
	

}
