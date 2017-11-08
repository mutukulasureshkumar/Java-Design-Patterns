/**
 * 
 */
package com.java.designpatterns.behavioral.command;

/**
 * @author Suresh Kumar Mutukula
 *
 */

/*
 * Its a client class
 * 
 */
public class CommandMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AC ac=new AC();
		TurnOnAC turnOnAC=new TurnOnAC(ac);
		TurnOffAC turnOffAC=new TurnOffAC(ac);
		
		Switch switche=new Switch();
		
		switche.addCommand(turnOnAC);
		switche.addCommand(turnOffAC);
		
		switche.execute();
		
		/*
		 * 
		 * Explanation :: Command Design Pattern.
		 * 
		 * In command design pattern we have 4 components.
		 * 1. Client :: Client is the one who issues the Command.
		 * 2. Command :: Command will be issues by the Client
		 * 3. Invoker :: Invoker will takes the command and invokes the receiver.
		 * 4. Receiver :: Receiver is the one who does the client command.
		 */
	}

}
