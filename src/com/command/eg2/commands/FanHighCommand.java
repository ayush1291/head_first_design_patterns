package com.command.eg2.commands;

import com.command.eg1.vendor.Fan;

public class FanHighCommand implements Command {
	Fan fan;
	int prevSpeed;

	public FanHighCommand(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void execute() {
		prevSpeed = fan.getSpeed();
		System.out.println("Execute of FanHighCommand");
		fan.high();
	}

	@Override
	public void undo() {
		System.out.println("Undo of FanHighCommand");
		if (prevSpeed == Fan.HIGH) {
			fan.high();
		} else if (prevSpeed == Fan.LOW) {
			fan.low();
		} else if (prevSpeed == Fan.OFF) {
			fan.off();
		}
	}

}
