/**
 * 
 */
package com.java.designpatterns.structural.Facade;

import java.util.List;

/**
 * @author Suresh Kumar Mutukula
 *
 */
public class SortingImpl {
	
	private MergeSort mergeSort;
	private HeapSort heapSort;
	
	public SortingImpl(){
		this.mergeSort=new MergeSort();
		this.heapSort=new HeapSort();
	}
	
	public <T> void mergeSort(List<T> list){
		mergeSort.sort(list);
	}

	public <T> void heapSort(List<T> list){
		heapSort.sort(list);
	}
}
