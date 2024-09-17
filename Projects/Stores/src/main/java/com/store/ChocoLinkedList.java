package com.store;

import java.util.LinkedList;

public class ChocoLinkedList {
	LinkedList<Chocolate> chocolinkedlist = new LinkedList<>();
	public ChocoLinkedList() {
		// TODO Auto-generated constructor stub
	}
	public ChocoLinkedList(LinkedList<Chocolate> chocolinkedlist) {
		super();
		this.chocolinkedlist = chocolinkedlist;
	}

	public LinkedList<Chocolate> getChocolinkedlist() {
		return chocolinkedlist;
	}

	public void setChocolinkedlist(LinkedList<Chocolate> chocolinkedlist) {
		this.chocolinkedlist = chocolinkedlist;
	}

	@Override
	public String toString() {
		return "ChocoLinkedList [chocolinkedlist=" + chocolinkedlist + "]";
	}
	
}
