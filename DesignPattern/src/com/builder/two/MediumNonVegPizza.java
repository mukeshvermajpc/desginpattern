package com.builder.two;
public class MediumNonVegPizza extends NonVegPizza {

	@Override
	public String name() {
		return "Non Veg Pizza";
	}

	@Override
	public String size() {
		return "Medium";
	}

	@Override
	public int price() {
		return 290;
	}
}
