package com.builder.two;

public class MediumCheezPizza extends VegPizza {

	@Override
	public String name() {
		return "Cheez Pizza";
	}

	@Override
	public String size() {
		return "Medium";
	}

	@Override
	public int price() {
		return 230;
	}
}
