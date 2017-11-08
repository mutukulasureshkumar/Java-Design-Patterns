/**
 * 
 */
package com.java.designpatterns.structural.flyweight;

import java.util.HashMap;

/**
 * @author Suresh Kumar Mutukula
 *
 */
public class ShapeFlyWeightFactory {
	private static HashMap<String, Shape> stringPool=new HashMap<String, Shape>();
	
	public static Shape getShape(String typeOfShape){
		if(typeOfShape!=null){
			if("circle".equalsIgnoreCase(typeOfShape)){
				Shape circleShape=stringPool.get(typeOfShape);
				if(circleShape==null){
					circleShape=new Circle();
					stringPool.put("circle", circleShape);
				}
				return circleShape;
			}
			if("triangle".equalsIgnoreCase(typeOfShape)){
				Shape triangleShape=stringPool.get(typeOfShape);
				if(triangleShape==null){
					triangleShape=new Triangle();
					stringPool.put("triangle", triangleShape);
				}
				return triangleShape;
			}
		}
		return null;
	}

}
