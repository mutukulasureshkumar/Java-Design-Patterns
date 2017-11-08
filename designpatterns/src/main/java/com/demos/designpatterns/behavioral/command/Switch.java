/**
 * 
 */
package com.java.designpatterns.behavioral.command;

import java.util.ArrayList;

/**
 * @author Suresh Kumar Mutukula
 *
 */

/*
 * Its a invoker class
 * 
 */
public class Switch {
	private ArrayList<Command> commands=new ArrayList<Command>();
	
	public void addCommand(Command command){
		commands.add(command);
	}
	
	
	public void execute(){
		for(Command command:commands)
			command.execute();
	}
	
}
