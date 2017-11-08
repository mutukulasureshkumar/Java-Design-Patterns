/**
 * 
 */
package com.java.designpatterns.structural.flyweight;

/**
 * @author Suresh Kumar Mutukula
 *
 */
public class Triangle implements Shape {

	/* (non-Javadoc)
	 * @see com.java.designpatterns.structural.flyweight.Shape#draw()
	 */
	String color;
	
	public void setColor(String color){
		this.color=color;
	}
	
	/**
	 * No-arg constructor
	 */
	public Triangle() {
		System.out.println("****************Triangle object created*********************");
	}

	@Override
	public void draw() {
		if(this.color==null)
			System.out.println("Triangle filled with No color");
		else
			System.out.println("Triangle filled with "+this.color);
	}

}
