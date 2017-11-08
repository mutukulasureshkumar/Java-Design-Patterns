/**
 * 
 */
package com.java.designpatterns.creational.abstractfactory;

/**
 * @author Suresh Kumar Mutukula
 *
 */
public class Green implements Color {

	/* (non-Javadoc)
	 * @see com.java.designpatterns.creational.abstractfactory.Color#fill()
	 */
	@Override
	public void fill() {
		System.out.println("filling green color...!");
	}

}
