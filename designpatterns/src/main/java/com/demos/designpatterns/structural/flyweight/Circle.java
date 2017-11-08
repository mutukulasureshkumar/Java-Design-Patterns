/**
 * 
 */
package com.java.designpatterns.structural.flyweight;

/**
 * @author Suresh Kumar Mutukula
 *
 */
public class Circle implements Shape {

	/* (non-Javadoc)
	 * @see com.java.designpatterns.structural.flyweight.Shape#draw()
	 */
	
	String color;
	
	public void setColor(String color){
		this.color=color;
	}
	
	/**
	 * 
	 */
	public Circle() {
		System.out.println("****************Circle object created*********************");
	}

	@Override
	public void draw() {
		if(this.color==null)
			System.out.println("Circle filled with No color");
		else
			System.out.println("Circle filled with "+this.color);
	}

}
