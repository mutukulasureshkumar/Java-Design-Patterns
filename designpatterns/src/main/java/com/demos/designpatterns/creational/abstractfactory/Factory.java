/**
 * 
 */
package com.java.designpatterns.creational.abstractfactory;

/**
 * @author Suresh Kumar Mutukula
 *
 */
public abstract class Factory {
	public abstract Shape getShape(String shape);
	public abstract Color getColor(String color);
}
