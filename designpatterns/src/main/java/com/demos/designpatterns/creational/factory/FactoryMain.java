/**
 * 
 */
package com.java.designpatterns.creational.factory;

/**
 * @author Suresh Kumar Mutukula
 *
 */
public class FactoryMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Shape shape;
		ShapeFactory shapeFactory=new ShapeFactory();
		
		//Here shape factory returns the circle object.
		shape=shapeFactory.getShape("circle");
		shape.draw();
		
		//Here shape factory returns the triangle object.
		shape=shapeFactory.getShape("triangle");
		shape.draw();
	}

}


/*
 * 
 * Explanation :: Factory Design Pattern.
 * 
 * Here we are not creating the object explicitly, shape factory object
 * creating the object for us based on the requirement.
 * 
 */