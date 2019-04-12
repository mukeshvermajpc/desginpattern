package com.builder.two;
public class SmallPepsi extends Pepsi{

	@Override
	public String name() {
		return "300 ml Pepsi";
	}

	@Override
	public String size() {
		return "Small";
	}

	@Override
	public int price() {
		return 30;
	}
	

}
