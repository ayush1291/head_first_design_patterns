package com.command.eg1.commands;

import com.command.eg1.vendor.Fan;

public class FanLowCommand implements Command {
	Fan fan;
	int prevSpeed;

	public FanLowCommand(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void execute() {
		prevSpeed = fan.getSpeed();
		System.out.println("Execute of FanLowCommand");
		fan.low();
	}

	@Override
	public void undo() {
		System.out.println("Undo of FanLowCommand");
		if (prevSpeed == Fan.HIGH) {
			fan.high();
		} else if (prevSpeed == Fan.LOW) {
			fan.low();
		} else if (prevSpeed == Fan.OFF) {
			fan.off();
		}
	}

}
