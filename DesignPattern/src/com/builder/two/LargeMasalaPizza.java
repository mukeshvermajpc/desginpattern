package com.builder.two;
public class LargeMasalaPizza extends VegPizza {

	@Override
	public String name() {
		return "Masala Pizza";
	}

	@Override
	public String size() {
		return "Large Size";
	}

	@Override
	public int price() {
		return 300;
	}
}
