package com.builder.two;
public class ExtraLargeNonVegPizza extends NonVegPizza {

	@Override
	public String name() {
		return "Non Veg Pizza";
	}

	@Override
	public String size() {
		return "Extra Large";
	}

	@Override
	public int price() {
		return 500;
	}
	

}
