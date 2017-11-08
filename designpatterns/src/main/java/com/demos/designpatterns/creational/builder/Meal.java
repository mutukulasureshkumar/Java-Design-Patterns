	package com.java.designpatterns.creational.builder;

import java.util.ArrayList;

import com.java.designpatterns.creational.builder.Item;

public class Meal {
	
	ArrayList<Item> items=new ArrayList<>();
	
	public void addItem(Item item){
		items.add(item);
	}
	
	public void Bill(){
		float totalCost=0;
		int count=1;
		System.out.println("S.No\t"+getSpace("Item")+"cost");
		System.out.println("----\t"+getSpace("----")+"----");
		for(Item item:items){
			System.out.println(count+")  \t"+getSpace(item.name())+item.cost());
			totalCost+=item.cost();
			count++;
		}
		System.out.println("--------------------------------------");
		System.out.println(getSpace("Total Cost")+"\t"+totalCost);
		System.out.println("--------------------------------------");
	}
	
	public String getSpace(String item){
		String res=item;
		for(int i=1; i<25-item.length(); i++){
			res+=" ";
		}
		return res;
	}

}
