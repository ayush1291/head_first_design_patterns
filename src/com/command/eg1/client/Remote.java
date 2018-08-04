package com.command.eg1.client;

import com.command.eg1.commands.Command;
import com.command.eg1.commands.NoCommand;

public class Remote {
	Command[] onCommands = new Command[4];
	Command lastCommand;
	
	//Assinging with no commands
	public Remote(){
		for (int i=0; i<onCommands.length; i++){
			onCommands[i] = new NoCommand();
		}
		lastCommand = new NoCommand();
	}
	
	public void setCommand(int i, Command onCommand) {
		onCommands[i] = onCommand;
	}
	
	public void onButtonPressed(int i){
		onCommands[i].execute();
		lastCommand=onCommands[i];
	}
		
	public void undoButtonPressed(){
		lastCommand.undo();
		
	}	
}
