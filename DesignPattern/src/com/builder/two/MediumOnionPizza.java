package com.builder.two;
public class MediumOnionPizza extends VegPizza {
	@Override
	public String name() {
		return "Onion Pizza";
	}

	@Override
	public String size() {
		return "Medium Size" ;
	}

	@Override
	public int price() {
		return 180;
	}

}
