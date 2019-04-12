package com.builder.two;

public class ExtraLargeCheesePizza extends VegPizza {

	@Override
	public String name() {
		return "Cheez Pizza";
	}

	@Override
	public String size() {
		return "Extra Large Size";
	}

	@Override
	public int price() {
		return 350;
	}

}
