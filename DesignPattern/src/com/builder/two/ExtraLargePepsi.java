package com.builder.two;

public class ExtraLargePepsi extends ColdDrink {

	@Override
	public String name() {
		return "Pepsi";
	}

	@Override
	public String size() {
		return "1000 ml";
	}

	@Override
	public int price() {
		return 120;
	}

}
