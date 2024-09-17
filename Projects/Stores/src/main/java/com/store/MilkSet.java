package com.store;

import java.util.HashSet;

public class MilkSet {
//Hashset
	
	HashSet<Milk> milkset = new HashSet<>();

public MilkSet(HashSet<Milk> milkset) {
	super();
	this.milkset = milkset;
}

public HashSet<Milk> getMilkset() {
	return milkset;
}

public void setMilkset(HashSet<Milk> milkset) {
	this.milkset = milkset;
}

@Override
public String toString() {
	return "MilkSet [milkset=" + milkset + "]";
}
	
}
