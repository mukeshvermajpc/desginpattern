package com.builder;
public class Local extends Company {

	@Override
	public int price() {
		return 80;
	}

	@Override
	public String pack() {
		return "Local";
	}

}
