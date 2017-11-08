package com.java.designpatterns.creational.builder;

public class MealBuilder {
	
	public static Meal prepareMeal(String typeOfMeal){
		Meal meal=null;
		if("VEG".equals(typeOfMeal)){
			meal=new Meal();
			meal.addItem(new VegBurger());
			meal.addItem(new Pepsi());
		}
		if("NONVEG".equals(typeOfMeal)){
			meal=new Meal();
			meal.addItem(new NonVegBurger());
			meal.addItem(new Coke());
		}
		return meal;
	}
}
