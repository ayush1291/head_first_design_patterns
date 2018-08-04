package com.command.eg1.commands;

import com.command.eg1.vendor.Light;

public class LightOnCommand implements Command{
	Light light;
	
	public LightOnCommand(Light light){
		this.light = light;
	}

	@Override
	public void execute() {
		System.out.println("Execute of LightOnCommand");
		light.on();
	}
	
	@Override
	public void undo() {
		System.out.println("Undo of LightOnCommand");
		light.off();
	}
	
}
