package com.store;

import java.util.TreeSet;

public class AppleTreeSet {
	TreeSet<Apple> appletreeset = new TreeSet<>();

	public AppleTreeSet(TreeSet<Apple> appletreeset) {
		super();
		this.appletreeset = appletreeset;
	}

	public TreeSet<Apple> getAppletreeset() {
		return appletreeset;
	}

	public void setAppletreeset(TreeSet<Apple> appletreeset) {
		this.appletreeset = appletreeset;
	}

	@Override
	public String toString() {
		return "AppleTreeSet [appletreeset=" + appletreeset + "]";
	}
	
}
