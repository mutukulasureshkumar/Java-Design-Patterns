/**
 * 
 */
package com.java.designpatterns.structural.decorator;

/**
 * @author Suresh Kumar Mutukula
 *
 */
public abstract class AddOn implements Order {

	/* (non-Javadoc)
	 * @see com.javaalgorithms.designpatterns.decorator.Order#discription()
	 */
	public void discription() {
		System.out.println("Add Ons::");
	}

}
