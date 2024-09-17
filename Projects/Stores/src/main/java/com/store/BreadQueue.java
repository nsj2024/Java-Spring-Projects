package com.store;

import java.util.LinkedList;
import java.util.Queue;

public class BreadQueue {
	Queue<Bread> breadqueue = new LinkedList<>();

	public BreadQueue(Queue<Bread> breadqueue) {
		super();
		this.breadqueue = breadqueue;
	}

	public Queue<Bread> getBreadqueue() {
		return breadqueue;
	}

	public void setBreadqueue(Queue<Bread> breadqueue) {
		this.breadqueue = breadqueue;
	}

	@Override
	public String toString() {
		return "BreadQueue [breadqueue=" + breadqueue + "]";
	}
	
}
