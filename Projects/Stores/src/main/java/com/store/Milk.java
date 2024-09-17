package com.store;

public class Milk {
	private double quantity;
	private double price;
	public Milk(double quantity, double price) {
		super();
		this.quantity = quantity;
		this.price = price;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Milk [quantity=" + quantity + ", price=" + price + "]";
	}
	
	
}
