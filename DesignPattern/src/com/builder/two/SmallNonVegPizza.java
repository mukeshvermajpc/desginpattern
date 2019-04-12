package com.builder.two;
public class SmallNonVegPizza  extends NonVegPizza{

	@Override
	public String name() {
	
		return "Non Veg Pizza";
	}

	@Override
	public String size() {
	
		return "Small Size";
	}

	@Override
	public int price() {
	
		return 200;
	}

}
