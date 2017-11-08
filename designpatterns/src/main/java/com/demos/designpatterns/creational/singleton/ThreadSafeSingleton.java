/**
 * 
 */
package com.java.designpatterns.creational.singleton;

/**
 * @author Suresh Kumar Mutukula
 *
 */
public class ThreadSafeSingleton {
	
	private static ThreadSafeSingleton threadSafeSingleton=null;
	
	private ThreadSafeSingleton(){}
	
	public static ThreadSafeSingleton getInstace(){
		if(threadSafeSingleton==null)
			synchronized (ThreadSafeSingleton.class) {
				threadSafeSingleton=new ThreadSafeSingleton();
			}
		return threadSafeSingleton;
	}

	/*
	 ** Above is the thread safe initialization of a singleton class.
	 * Class is initialized same as lazy initialization but in the 
	 * getInstance method we included synchronized block to make the 
	 * transaction as thread safe.
	 * 
	 */
}
