/**
 * 
 */
package com.java.designpatterns.behavioral.command;

/**
 * @author Suresh Kumar Mutukula
 *
 */
public class TurnOffAC implements Command {

	/* (non-Javadoc)
	 * @see com.java.designpatterns.behavioral.command.Command#execute()
	 */
	
	private AC ac;
	
	public TurnOffAC(AC ac){
		this.ac=ac;
	}
	@Override
	public void execute() {
		this.ac.turnOff();
	}

}
