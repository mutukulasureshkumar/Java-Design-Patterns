/**
 * 
 */
package com.java.designpatterns.creational.factory;

/**
 * @author Suresh Kumar Mutukula
 *
 */
public class ShapeFactory {

	public Shape getShape(String shape){
		if(shape !=null && shape.trim().length()>0){
			if("circle".equalsIgnoreCase(shape))
				return new Circle();
			if("triangle".equalsIgnoreCase(shape))
				return new Triangle();
			else
				return null;
		}
		return null;
	}
}
