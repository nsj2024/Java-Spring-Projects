package com.store;

public class EGG {
	private double price;

	private int quantity;
	
	public EGG(double price,int quantity) {
		super();
		this.price = price;
		
		this.quantity = quantity;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	@Override
	public String toString() {
		return "EGG [price=" + price + ", quantity=" + quantity + "]";
	}
	
	
	
}
