/**
 * 
 */
package com.java.designpatterns.creational.abstractfactory;

/**
 * @author Suresh Kumar Mutukula
 *
 */
public class AbstractFactoryMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Shape shape;
		Color color;
		AbstractFactory abstractFactory = new AbstractFactory();
		
		// Here abstract factory returns the shape factory object.
		Factory shapeFactory = abstractFactory.getFactory("shape");
		// Here abstract factory returns the color factory object.
		Factory colorFactory = abstractFactory.getFactory("color");

		
		// Here shape factory returns the circle object.
		shape = shapeFactory.getShape("circle");
		shape.draw();
		// Here color factory returns the green object.
		color = colorFactory.getColor("green");
		color.fill();
		
		
		// Here shape factory returns the triangle object.
		shape = shapeFactory.getShape("triangle");
		shape.draw();
		// Here color factory returns the red object.
		color = colorFactory.getColor("red");
		color.fill();
	}
	
	/*
	 * 
	 * Explanation :: Abstract Factory Design Pattern.
	 * 
	 * Here we are not creating the factory object explicitly, abstract factory object
	 * creating the factory object for us, based on the requirement.
	 * 
	 */

}
