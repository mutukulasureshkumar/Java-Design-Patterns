/**
 * 
 */
package com.java.designpatterns.structural.decorator;

/**
 * @author Suresh Kumar Mutukula
 *
 */
public class Jalapeno extends AddOn {
	
	private Order order;
	
	public Jalapeno(Order order){
		this.order=order;
	}

	/* (non-Javadoc)
	 * @see com.javaalgorithms.designpatterns.decorator.Order#cost()
	 */
	public double cost() {
		return order.cost()+30;
	}

}
