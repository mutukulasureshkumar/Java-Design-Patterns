/**
 * 
 */
package com.java.designpatterns.creational.singleton;

/**
 * @author Suresh Kumar Mutukula
 *
 */
public class DoubleLockingSingleton {
private static DoubleLockingSingleton doubleLockingSingleton=null;
	
	private DoubleLockingSingleton(){}
	
	public static synchronized DoubleLockingSingleton getInstace(){
		if(doubleLockingSingleton==null){
			synchronized (doubleLockingSingleton) {
				if(doubleLockingSingleton==null)
					doubleLockingSingleton=new DoubleLockingSingleton();
			}
		}
		return doubleLockingSingleton;
	}
	
	/*
	 ** Above is the double locking singleton.
	 * Here me marked getInstance method as synchronized block and 
	 * we are checking the doubleLockingSingleton==null for the  two times
	 * to avoid the breaking on single check.
	 * 
	 */

}
