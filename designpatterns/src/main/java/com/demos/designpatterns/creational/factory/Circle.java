/**
 * 
 */
package com.java.designpatterns.creational.factory;

/**
 * @author Suresh Kumar Mutukula
 *
 */
public class Circle implements Shape {

	/* (non-Javadoc)
	 * @see com.java.designpatterns.creational.factory.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("drawing circle...!");
	}

}
