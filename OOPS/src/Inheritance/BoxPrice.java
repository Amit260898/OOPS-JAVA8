package Inheritance;

public class BoxPrice extends BoxWeight{
	
	double price;

	public BoxPrice(double price) {
		super();
		this.price = price;
	}

	public BoxPrice(BoxPrice other) {
		super(other);
		this.price=price;
		// TODO Auto-generated constructor stub
	}

	public BoxPrice(Box old) {
		super(old);
		// TODO Auto-generated constructor stub
	}

	public BoxPrice(double l, double w, double h, double weight,double price) {
		super(l, w, h, weight);
		// TODO Auto-generated constructor stub
		this.price=price;
		
	}
	
	
	
	

}
