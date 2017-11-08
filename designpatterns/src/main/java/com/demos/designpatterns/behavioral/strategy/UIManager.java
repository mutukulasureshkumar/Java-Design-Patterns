/**
 * 
 */
package com.java.designpatterns.behavioral.strategy;

/**
 * @author Suresh Kumar Mutukula
 *
 */
public class UIManager implements Strategy{
	
	private Strategy strategy;
	
	public UIManager(Strategy strategy){
		this.strategy=strategy;
	}

	/* (non-Javadoc)
	 * @see com.javaalgorithms.designpatterns.strategy.Strategy#generateUI(java.lang.Object)
	 */
	public <T> void generateUI(T t) {
		strategy.generateUI(t);
	}
}
