/**
 * 
 */
package com.java.designpatterns.behavioral.strategy;

/**
 * @author Suresh Kumar Mutukula
 *
 */
public class StrategyMain {

	public static void main(String[] args) {
		
		UIManager uiManager=null;
		
		uiManager=new UIManager(new GenerateAJS());
		uiManager.generateUI(new Object());
		
		uiManager=new UIManager(new GenerateJSP());
		uiManager.generateUI(new Object());
		
		
		/**
		 * Explanation:: Strategy Design Pattern
		 * 
		 * By implementing Strategy design pattern, developer 
		 * can switch to his desired UI technology on the fly without 
		 * modifying lots of code and lots of classes.
		 * 
		 * In Future, if there is an another new UI technology 
		 * boomed, we can easily integrate the UI technology
		 * in our application with out changing number of lines 
		 * and classes with the help of Strategy Pattern.
		 * 
		 * 
		 */
		
		
	}

}
