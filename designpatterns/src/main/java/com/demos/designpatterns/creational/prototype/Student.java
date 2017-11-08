/**
 * 
 */
package com.java.designpatterns.creational.prototype;

/**
 * @author Suresh Kumar Mutukula
 *
 */
public class Student implements Prototype {
	String name;
	int id;
	Stream stream;
	
	public Student(String name, int id, Stream stream) {
		this.name=name;
		this.id=id;
		this.stream=stream;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public Stream getStream() {
		return stream;
	}
	/* (non-Javadoc)
	 * @see com.java.designpatterns.creational.prototype.Prototype#cloneObject()
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		Student student=(Student) super.clone();
		student.stream=(Stream) stream.clone();
		return student;
	}
	
	public void print(){
		System.out.println("-:Student Details:-\n  Name :: "+getName()+"\n  Id :: "+getId()+""
				+ "\n  Streams :: "+stream.getSubject1()+", "+stream.getSubject2()+", "+stream.getSubject3());
	}
	
}
