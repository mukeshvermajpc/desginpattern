package com.builder.two;
public class ExtraLargeMasalaPizza extends VegPizza {

	@Override
	public String name() {
		return "Masala Pizza";
	}

	@Override
	public String size() {
		return "Extra Large";
	}

	@Override
	public int price() {
		return 400;
	}   
}
