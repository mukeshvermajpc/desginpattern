package com.builder.two;
public class SmallMasalaPizza extends VegPizza {

	@Override
	public String name() {
		return "Masala Pizza";
	}

	@Override
	public String size() {
		return "Small Size";
	}

	@Override
	public int price() {
		return 130;
	}

}
