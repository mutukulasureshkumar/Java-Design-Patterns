/**
 * 
 */
package com.java.designpatterns.structural.decorator;

/**
 * @author Suresh Kumar Mutukula
 *
 */
public class Pizza implements Order {

	/* (non-Javadoc)
	 * @see com.javaalgorithms.designpatterns.decorator.Order#discription()
	 */
	public void discription() {
		System.out.println("Regular Pizza");
	}

	/* (non-Javadoc)
	 * @see com.javaalgorithms.designpatterns.decorator.Order#cost()
	 */
	public double cost() {
		return 100;
	}

}
