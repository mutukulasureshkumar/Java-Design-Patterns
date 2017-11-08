/**
 * 
 */
package com.java.designpatterns.creational.abstractfactory;

/**
 * @author Suresh Kumar Mutukula
 *
 */
public class ShapeFactory extends Factory {

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

	/* (non-Javadoc)
	 * @see com.java.designpatterns.creational.abstractfactory.Factory#fillColor(java.lang.String)
	 */
	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}
}
