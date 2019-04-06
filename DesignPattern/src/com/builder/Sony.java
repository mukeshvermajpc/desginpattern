package com.builder;
public class Sony extends Company{

	@Override
	public int price() {
		return 120;
	}

	@Override
	public String pack() {
		return "Sony CD";
	}

}
