/**
 * 
 */
package com.java.designpatterns.behavioral.strategy;

import com.java.designpatterns.behavioral.strategy.Strategy;

/**
 * @author Suresh Kumar Mutukula
 *
 */
public class GenerateAJS implements Strategy {

	/* (non-Javadoc)
	 * @see com.javaalgorithms.designpatterns.strategy.Strategy#generateUI(java.lang.Object)
	 */
	public <T> void generateUI(T t) {
		System.out.println("Generates UI code with Angular JS Technologies");
	}

}
