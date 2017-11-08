package com.java.designpatterns.creational.builder;

public class VegBurger extends Burger {

	@Override
	public String name() {
		return "Veg Crispy Burger";
	}

	@Override
	public float cost() {
		return 50;
	}

}
