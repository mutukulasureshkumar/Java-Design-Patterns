/**
 * 
 */
package com.java.designpatterns.structural.adapter;

/**
 * @author Suresh Kumar Mutukula
 *
 */
public class Bicycle implements NonAccelerateVehicle {
	public void peddling(){
		System.out.println("Bucycle Started Moving....!");
	}

	/* (non-Javadoc)
	 * @see com.javaalgorithms.designpatterns.adapter.NonAccelerateVehicle#startRiding()
	 */
	@Override
	public void startMoving() {
		peddling();
	}
}
