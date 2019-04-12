package com.builder.two;
public class LargeNonVegPizza extends NonVegPizza {

	@Override
	public String name() {
		return "Non Veg Pizza";
	}

	@Override
	public String size() {
		return "Large Size";
	}

	@Override
	public int price() {
		return 400;
	}
	

}
