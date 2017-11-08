/**
 * 
 */
package com.java.designpatterns.structural.Facade;

import java.util.ArrayList;

/**
 * @author Suresh Kumar Mutukula
 *
 */
public class FacadeMain {

	/**
	 * @param <T>
	 * @param args
	 */
	public static <T> void main(String[] args) {
		SortingImpl sortingImpl=new SortingImpl();
		sortingImpl.mergeSort(new ArrayList<T>());
		sortingImpl.heapSort(new ArrayList<T>());
	}
	/*
	 * Explanation :: Facade Design Pattern
	 * 
	 * As it name, Facade shows only the face part of the 
	 * project and hides actual implementation part at back end.
	 * 
	 * In this example, SortingImple class given us a merge or heap 
	 * sort method, and implementation of both the algorithms
	 * are hidden and not visible to the client.
	 * 
	 */

}
