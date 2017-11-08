/**
 * 
 */
package com.java.designpatterns.structural.adapter;

/**
 * @author Suresh Kumar Mutukula
 *
 */
public class AdapterMain {

	/**
	 * @param args
	 */
		
	public static void main(String[] args) {
		
		Vehicle vehicle;

		//Creating Bus object and calling accelerate method of car object.
		vehicle=new Car();
		vehicle.accelerate();
		
		//Creating Bus object and calling accelerate method of bus object.
		vehicle=new Bus();
		vehicle.accelerate();
		
		/**Creating nonAccelerate vehicle Adapter object
		 * passing Bicycle object as an constructor argument.
		 * and calling accelerate method of car object.
		 */
		vehicle=new NonAccelerateVehicleAdapter(new Bicycle());
		vehicle.accelerate();
	}
	
	/*
	 * Explanation :: Adapter Design Pattern
	 * 
	 * Adapter design pattern object act as a bridge between
	 * two different behavior objects belongs to the same Species
	 * 
	 * In this example, Car, Bus and Bicycle are belongs to the same 
	 * species called vehicle, but bicycle can not accelerate as bus and car.
	 * To move the bicycle we have to paddle.
	 * 
	 *  Non Accelerate Vehicle Adapter class acts as a bridge between Accelerate 
	 *  and non Accelerate vehicles. 
	 * 
	 * 
	 * 
	 */

}
