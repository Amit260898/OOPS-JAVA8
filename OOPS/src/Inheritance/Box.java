package Inheritance;

import javax.sound.sampled.BooleanControl;

public class Box {
	
	double l;
	double w;
	double h;
	
	public Box() {
		// TODO Auto-generated constructor stub'
		this.l=-1;
		this.w=-1;
		this.h=-1;
	}
	
	//cube
	Box(double side){
		
		this.l=side;
		this.w=side;
		this.h=side;
	}
	
	//
	Box(double l,double w, double h){
		
		this.l=l;
		this.w=w;
		this.h=h;
	}
	
	Box(Box old){
		
		this.h=old.h;
		this.l=old.l;
		this.w=old.w;
		
	}
	
	public void information() {
		
		System.out.println("running the box");
	}
	
}