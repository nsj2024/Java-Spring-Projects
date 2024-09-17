package com.iiht.iocday2;

public class Rhombus implements Shape{
	private double side;
	
	@Override
	public String toString() {
		return "Rhombus [side=" + side + "]";
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.side*this.side;
	}

	@Override
	public String getShape() {
		// TODO Auto-generated method stub
		return getClass().getName();
	}
	

}
