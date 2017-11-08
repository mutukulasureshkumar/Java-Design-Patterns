/**
 * 
 */
package com.java.designpatterns.structural.adapter;

/**
 * @author Suresh Kumar Mutukula
 *
 */
public class NonAccelerateVehicleAdapter implements Vehicle {
	
	private NonAccelerateVehicle nonAccelerateVehicle;
	
	public NonAccelerateVehicleAdapter(NonAccelerateVehicle nonAccelerateVehicle){
		this.nonAccelerateVehicle=nonAccelerateVehicle;
	}

	/* (non-Javadoc)
	 * @see com.javaalgorithms.designpatterns.adapter.Vehicle#accelerate()
	 */
	@Override
	public void accelerate() {
		nonAccelerateVehicle.startMoving();
	}
}
