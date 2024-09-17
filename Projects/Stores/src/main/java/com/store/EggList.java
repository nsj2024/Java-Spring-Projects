package com.store;

import java.util.ArrayList;

public class EggList {
	private ArrayList<EGG> egglist = new ArrayList<>();

	public EggList(ArrayList<EGG> egglist) {
		super();
		this.egglist = egglist;
	}

	public ArrayList<EGG> getEgglist() {
		return egglist;
	}

	public void setEgglist(ArrayList<EGG> egglist) {
		this.egglist = egglist;
	}

	@Override
	public String toString() {
		return "EggList [egglist=" + egglist + "]";
	}
	
	
}
