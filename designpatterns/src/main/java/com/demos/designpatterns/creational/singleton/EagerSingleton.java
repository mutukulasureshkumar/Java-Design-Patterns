/**
 * 
 */
package com.java.designpatterns.creational.singleton;

/**
 * @author Suresh Kumar Mutukula
 *
 */
public class EagerSingleton {
	private static final EagerSingleton eagerSingleton=new EagerSingleton();
	
	private EagerSingleton(){}
	
	public static EagerSingleton getInstance(){
		return eagerSingleton;
	}
	
	
	/*
	 ** Above is the Eager initialization of a singleton class.
	 * Object of the class is created at the beginning and marking as static final. 
	 * Whenever user call getInstace method, it returns already initialized object.
	 * 
	 */
}
