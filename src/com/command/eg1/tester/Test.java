package com.command.eg1.tester;

import com.command.eg1.client.Remote;
import com.command.eg1.commands.FanHighCommand;
import com.command.eg1.commands.FanLowCommand;
import com.command.eg1.commands.FanOffCommand;
import com.command.eg1.commands.LightOffCommand;
import com.command.eg1.commands.LightOnCommand;
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
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		
		remote.setCommand(0, lightOnCommand, lightOffCommand);
		remote.setCommand(1, fanLowCommand, fanOffCommand);
		remote.setCommand(2, fanHighCommand, fanOffCommand);

		System.out.println("Testing.....");
		
		remote.onButtonPressed(0);
		remote.offButtonPressed(0);
		
		remote.onButtonPressed(1);
		remote.onButtonPressed(2);
		remote.offButtonPressed(2);
		remote.undoButtonPressed();
	}
}
