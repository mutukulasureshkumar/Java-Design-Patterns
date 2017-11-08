package com.java.designpatterns.creational.builder;

import java.util.Scanner;

public class BuilderPatterenMain {
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome to Alti hotel. We serve two types of meals. Please select the type of meal you like.\n1)For veg Meal, please type VEG.\n2)For non-veg meal, please type NONVEG.\n");
		String mealType=scanner.next().trim();
		scanner.close();
		if("VEG".equalsIgnoreCase(mealType) || "NONVEG".equalsIgnoreCase(mealType)){
			Meal vegMeal=MealBuilder.prepareMeal(mealType.toUpperCase());
			vegMeal.Bill();
			System.out.println("\n\n");
		}else{
			System.out.println("Error::Invalid selection try again...!!!");
		}
	}
}
