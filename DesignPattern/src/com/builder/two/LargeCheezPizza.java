package com.builder.two;

public class LargeCheezPizza extends Pizza {
	@Override
	public String name() {
		return "Cheez Pizza";
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
