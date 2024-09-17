package com.iiht.iocday2;

import java.util.logging.Logger;

public class Rectangle implements Shape{
	
	private double length;
	private double breadth;
	Logger l = Logger.getLogger("Rectangle");
	public Rectangle() {
		
	}
	
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.length* this.breadth;
	}

	@Override
	public String getShape() {
		// TODO Auto-generated method stub
		return getClass().getName();
	}
	
	public void init() {
		l.info("init started");
	}
	
	public void destroy() {
		l.info("Destroyed");
	}
	
}
