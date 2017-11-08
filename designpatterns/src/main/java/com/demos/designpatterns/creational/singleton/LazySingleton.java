/**
 * 
 */
package com.java.designpatterns.creational.singleton;

/**
 * @author Suresh Kumar Mutukula
 *
 */
public class LazySingleton {
	
	private static LazySingleton lazySingleton=null;
	
	private LazySingleton(){}
	
	public static LazySingleton getInstance(){
		if(lazySingleton == null)
			lazySingleton=new LazySingleton();
		return lazySingleton;
	}

	/*
	 ** Above is the lazy initialization of a singleton class.
	 * Class is initialized when ever user requested for the 
	 * object. getInstance method created the object only when
	 * the object is null, otherwise it returns the already
	 * created object.
	 * 
	 * Note: It is not a thread safe.
	 * 
	 */
}
