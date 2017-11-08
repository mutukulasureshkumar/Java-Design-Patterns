/**
 * 
 */
package com.java.designpatterns.structural.Facade;

import java.util.List;

/**
 * @author Suresh Kumar Mutukula
 *
 */
public class HeapSort implements Algorithm {

	/* (non-Javadoc)
	 * @see com.javaalgorithms.designpatterns.Facade.Algorithm#sort(java.util.List)
	 */
	public <T> void sort(List<T> list) {
		System.out.println("Heap sort implementation");
	}

}
