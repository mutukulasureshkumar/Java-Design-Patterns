/**
 * 
 */
package com.java.designpatterns.structural.flyweight;

/**
 * @author Suresh Kumar Mutukula
 *
 */
public class FlyweightMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		for(int i=0; i<20; i++){
			Circle circle=(Circle) ShapeFlyWeightFactory.getShape("circle");
			if(i==2)
				circle.setColor("orange");
			if(i==10)
				circle.setColor("white");
			if(i==10)
				circle.setColor("green");
			circle.draw();
			
			Triangle triangle=(Triangle) ShapeFlyWeightFactory.getShape("triangle");
			if(i==2)
				triangle.setColor("orange");
			if(i==10)
				triangle.setColor("white");
			if(i==10)
				triangle.setColor("green");
			triangle.draw();
		}
	}
	
	/*
	 * Explanation :: Flyweight Design Pattern
	 * 
	 *  Flyweight design pattern is used when we need to create a lot of Objects of a same type of class, 
	 *  flyweight design pattern can be applied to reduce the load on memory by sharing objects.
	 * 
	 */


}
