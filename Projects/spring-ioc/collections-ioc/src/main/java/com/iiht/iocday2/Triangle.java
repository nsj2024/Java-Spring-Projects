package com.iiht.iocday2;

public class Triangle implements Shape{
	private double base;
	private double height;
	
	
	
	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + "]";
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.base * this.height *0.5;
	}

	@Override
	public String getShape() {
		// TODO Auto-generated method stub
		return getClass().getName();
	}

}
