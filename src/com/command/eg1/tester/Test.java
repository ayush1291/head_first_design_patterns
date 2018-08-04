package com.command.eg1.tester;

import com.command.eg1.client.Remote;
import com.command.eg1.commands.FanHighCommand;
import com.command.eg1.commands.FanLowCommand;
import com.command.eg1.commands.FanOffCommand;
import com.command.eg1.commands.LightCommand;
import com.command.eg1.vendor.Fan;
import com.command.eg1.vendor.Light;

public class Test {

	public static void main(String[] args) {
		Remote remote = new Remote();
		
		Fan fan = new Fan();
		FanHighCommand fanHighCommand = new FanHighCommand(fan);
		FanLowCommand fanLowCommand = new FanLowCommand(fan);
		FanOffCommand fanOffCommand = new FanOffCommand(fan);
		
		Light light = new Light();
		LightCommand lightCommand = new LightCommand(light);
		
		remote.setCommand(0, lightCommand);
		remote.setCommand(1, fanOffCommand);
		remote.setCommand(2, fanLowCommand);
		remote.setCommand(3, fanHighCommand);
		
		System.out.println("Testing.....");
		
		remote.onButtonPressed(0);
		remote.onButtonPressed(1);
		remote.onButtonPressed(2);
		remote.undoButtonPressed();
		remote.undoButtonPressed();
		remote.onButtonPressed(3);
		remote.onButtonPressed(2);
		remote.onButtonPressed(0);
		remote.onButtonPressed(3);
		remote.undoButtonPressed();
	}
}
