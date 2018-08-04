package com.command.eg1.client;

public class Fan {
	public static final int HIGH = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;

	String location;
	int speed;

	public Fan(String location) {
		this.location = location;
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
