package com.command.eg2.vendor;

public class Fan {
	public static final int HIGH = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	int speed;

	public Fan() {
		speed = OFF;

	}

	public void high() {
		speed = HIGH;
	}
	public void low() {
		speed = LOW;
	}

	public void off() {
		speed = OFF;
	}

	public int getSpeed() {
		return speed;
	}
}
