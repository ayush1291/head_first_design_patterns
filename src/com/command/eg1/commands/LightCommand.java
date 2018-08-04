package com.command.eg1.commands;

import com.command.eg1.vendor.Light;

public class LightCommand implements Command{
	Light light;
	boolean isOn;
	
	public LightCommand(Light light){
		this.light = light;
	}

	@Override
	public void execute() {
		System.out.println("Execute of LightCommand");
		if(!isOn){
			light.on();
			isOn=true;
		}
		else {
			light.off();isOn=false;
		}
	}
	
	@Override
	public void undo() {
		System.out.println("Undo of LightCommand");
		execute();
	}
}
