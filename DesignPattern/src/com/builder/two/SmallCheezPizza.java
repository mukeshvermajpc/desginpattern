package com.builder.two;
public class SmallCheezPizza extends VegPizza{

	@Override
	public String name() {
		return "Cheez pizza";
	}

	@Override
	public String size() {
		return "Small size";
	}

	@Override
	public int price() {
		return 170;
	}

}
