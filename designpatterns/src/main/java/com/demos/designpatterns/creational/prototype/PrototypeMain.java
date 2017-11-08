/**
 * 
 */
package com.java.designpatterns.creational.prototype;

/**
 * @author Suresh Kumar Mutukula
 *
 */
public class PrototypeMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stream mpc=new Stream("Maths", "Physics", "Chemistry");
		Student student1=new Student("Peter", 1, mpc);
		
		try {
			Student student2=(Student) student1.clone();
			student2.name="Suresh";
			student2.id=2;
			student2.print();
			student2.stream.subject1="Civil";;
			student1.print();


		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
