package com.store;

public class Bread {
	
	private double price;
	private int packet_avail;
	
	public Bread(double price, int packet_avail) {
		super();
		this.price = price;
		this.packet_avail = packet_avail;
		
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getPacket_avail() {
		return packet_avail;
	}
	public void setPacket_avail(int packet_avail) {
		this.packet_avail = packet_avail;
	}
	
	@Override
	public String toString() {
		return "Bread [price=" + price + ", packet_avail=" + packet_avail + " ]";
	}
	
	

}
