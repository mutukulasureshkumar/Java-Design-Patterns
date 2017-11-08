/**
 * 
 */
package com.java.designpatterns.structural.decorator;

/**
 * @author Suresh Kumar Mutukula
 *
 */
public class DecoratorMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Order order=new Pizza();
		order=new Cheese(order);
		order=new Jalapeno(order);
		System.out.println(order.cost());
	}
	
	/*
	 * 
	 * Explanation :: Decorator Design Pattern
	 * 
	 * This is the perfect example for decorator design pattern.
	 * If there is a requirement like enhancing or adding some features 
	 * to the existing base feature.
	 * 
	 */

}
