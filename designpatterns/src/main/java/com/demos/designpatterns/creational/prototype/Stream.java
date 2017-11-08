/**
 * 
 */
package com.java.designpatterns.creational.prototype;

/**
 * @author Suresh Kumar Mutukula
 *
 */
public class Stream implements Prototype {
	
	String subject1;
	String subject2;
	String subject3;
	
	public Stream(String subject1, String subject2, String subject3){
		this.subject1=subject1;
		this.subject2=subject2;
		this.subject3=subject3;
	}

	public String getSubject1() {
		return subject1;
	}

	public String getSubject2() {
		return subject2;
	}

	public String getSubject3() {
		return subject3;
	}

	/* (non-Javadoc)
	 * @see com.java.designpatterns.creational.prototype.Prototype#cloneObject()
	 */
	/*@Override*/
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
