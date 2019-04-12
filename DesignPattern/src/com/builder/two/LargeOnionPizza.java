package com.builder.two;
public class LargeOnionPizza extends VegPizza {
	@Override
	public String name() {
		return "Large Onion Pizza";
	}

	@Override
	public String size() {
		return "Large Size";
	}

	@Override
	public int price() {
		return 350;
	}
	

}
