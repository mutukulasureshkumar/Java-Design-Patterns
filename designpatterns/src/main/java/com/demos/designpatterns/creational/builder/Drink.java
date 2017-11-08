package com.java.designpatterns.creational.builder;

import com.java.designpatterns.creational.builder.Item;
import com.java.designpatterns.creational.builder.Packing;

public abstract class Drink implements Item {

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Bottle();
	}

}
