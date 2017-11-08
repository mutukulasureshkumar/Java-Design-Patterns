/**
 * 
 */
package com.java.designpatterns.structural.Facade;

import java.util.List;

/**
 * @author Suresh Kumar Mutukula
 *
 */
public interface Algorithm {
	<T> void sort(List<T> list);
}
