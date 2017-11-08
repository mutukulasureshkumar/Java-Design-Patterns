/**
 * 
 */
package com.java.designpatterns.structural.adapter;

/**
 * @author Suresh Kumar Mutukula
 *
 */
public class Bus implements Vehicle {

	/* (non-Javadoc)
	 * @see com.javaalgorithms.designpatterns.adapter.Vehicle#accelerate()
	 */
	@Override
	public void accelerate() {
		System.out.println("Bus Started Moving...!!");
	}

}
