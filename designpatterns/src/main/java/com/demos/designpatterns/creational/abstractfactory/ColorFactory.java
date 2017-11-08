/**
 * 
 */
package com.java.designpatterns.creational.abstractfactory;

/**
 * @author Suresh Kumar Mutukula
 *
 */
public class ColorFactory extends Factory {
	public Color getColor(String color){
		if(color !=null && color.trim().length()>0){
			if("green".equalsIgnoreCase(color))
				return new Green();
			if("red".equalsIgnoreCase(color))
				return new Red();
			else
				return null;
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see com.java.designpatterns.creational.abstractfactory.Factory#getShape(java.lang.String)
	 */
	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}
}
