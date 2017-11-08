/**
 * 
 */
package com.java.designpatterns.behavioral.command;

/**
 * @author Suresh Kumar Mutukula
 *
 */
public class TurnOnAC implements Command {

	/* (non-Javadoc)
	 * @see com.java.designpatterns.behavioral.command.Command#execute()
	 */
	
	private AC ac;
	
	public TurnOnAC(AC ac){
		this.ac=ac;
	}
	@Override
	public void execute() {
		this.ac.turnOn();
	}

}
