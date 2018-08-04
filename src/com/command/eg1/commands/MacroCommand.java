package com.command.eg1.commands;

public class MacroCommand implements Command {
	Command[] commands;

	public MacroCommand(Command[] commands) {
		this.commands = commands;
	}

	public void execute() {
		for (int i = 0; i < commands.length; i++) {
			System.out.println("macro  -> "+ i);
			commands[i].execute();
		}
	}

	@Override
	public void undo() {
		for (int i = 0; i < commands.length; i++) {
			System.out.println("macro  -> "+ i);
			commands[i].undo();
		}
		
	}
}
