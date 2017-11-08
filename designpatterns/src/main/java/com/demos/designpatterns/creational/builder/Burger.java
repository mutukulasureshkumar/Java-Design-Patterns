package com.java.designpatterns.creational.builder;

import com.java.designpatterns.creational.builder.Item;
import com.java.designpatterns.creational.builder.Packing;

public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}
}
