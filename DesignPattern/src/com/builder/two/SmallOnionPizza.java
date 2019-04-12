package com.builder.two;
public class SmallOnionPizza extends VegPizza {

	@Override
	public String name() {
		return "Onion Pizza";
	}

	@Override
	public String size() {
		return "Small Size";
	}

	@Override
	public int price() {
		return 120;
	}

}
