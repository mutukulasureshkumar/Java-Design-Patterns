/**
 * 
 */
package com.java.designpatterns.behavioral.strategy;

/**
 * @author Suresh Kumar Mutukula
 *
 */
public class GenerateJSP implements Strategy{

	/* (non-Javadoc)
	 * @see com.javaalgorithms.designpatterns.strategy.Strategy#generateUI(java.lang.Object)
	 */
	public <T> void generateUI(T t) {
		System.out.println("Generates UI code with JSP Technologies");
	}

}
