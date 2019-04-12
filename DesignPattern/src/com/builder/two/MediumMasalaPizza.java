package com.builder.two;
public class MediumMasalaPizza extends VegPizza {

	@Override
	public String name() {
		return "MasalaPizza";
	}

	@Override
	public String size() {
		return "Medium Size";
	}

	@Override
	public int price() {
		return 200;
	}
}
