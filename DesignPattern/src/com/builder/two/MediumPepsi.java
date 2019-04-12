package com.builder.two;

public class MediumPepsi extends Pepsi{

	@Override
	public String name() {
		
		return "Pepsi";
	}

	@Override
	public String size() {
		return "500 ml";
	}

	@Override
	public int price() {
		return 60;
	}

}
