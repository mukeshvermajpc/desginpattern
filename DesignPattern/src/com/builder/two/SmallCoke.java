package com.builder.two;

public class SmallCoke extends Coke {

	@Override
	public String name() {
		return "Small Coke";
	}

	@Override
	public String size() {
		return "Small Size";
	}

	@Override
	public int price() {
		return 25;
	}

}
