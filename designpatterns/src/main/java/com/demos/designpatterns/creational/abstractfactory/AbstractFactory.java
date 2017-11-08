/**
 * 
 */
package com.java.designpatterns.creational.abstractfactory;

/**
 * @author Suresh Kumar Mutukula
 *
 */
public class AbstractFactory {

	public Factory getFactory(String factory){
		if(factory !=null && factory.trim().length()>0){
			if("shape".equalsIgnoreCase(factory))
				return new ShapeFactory();
			if("color".equalsIgnoreCase(factory))
				return new ColorFactory();
			else
				return null;
		}
		return null;
	}
}
