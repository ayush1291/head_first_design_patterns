package com.command.eg2.client;

import com.command.eg1.commands.Command;
import com.command.eg1.commands.NoCommand;

public class Remote {
	Command[] onCommands = new Command[3];
	Command[] offCommands = new Command[3];
	Command lastCommand;
	public Remote(){
		for (int i=0; i<3; i++){
			onCommands[i] = new NoCommand();
			offCommands[i] = new NoCommand();
		}
		lastCommand = new NoCommand();
	}
	
	public void setCommand(int i, Command onCommand, Command offCommand) {
		onCommands[i] = onCommand;
		offCommands[i] = offCommand;
	}
	
	public void onButtonPressed(int i){
		onCommands[i].execute();
	}
	
	public void offButtonPressed(int i){
		offCommands[i].execute();
	}
		
	public void undoButtonPressed(){
		lastCommand.undo();
		
	}	
}
