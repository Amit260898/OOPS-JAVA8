package Inheritance;

public class BoxWeight extends Box{
	
	double weight;
	
	public BoxWeight(double weight) {
		// TODO Auto-generated constructor stub
		this.weight=weight;
	}

	public BoxWeight() {
		super();
		this.weight=-1;
		// TODO Auto-generated constructor stub
	}

	public BoxWeight(Box old) {
		super(old);
		// TODO Auto-generated constructor stub
	}

	public BoxWeight(double l, double w, double h,double weight) {
		super(l, w, h);
		this.weight=weight;
		// TODO Auto-generated constructor stub
	}
	
	
	

}
