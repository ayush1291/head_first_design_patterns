package com.command.eg1.vendor;

public class Fan {
	public static final int HIGH = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	int speed;

	public Fan() {
		speed = OFF;
	}

	public void high() {
		System.out.println("Running at high speed");
		speed = HIGH;
	}
	public void low() {
		System.out.println("Running at low speed");
		speed = LOW;
	}

	public void off() {
		System.out.println("Running at no speed");
		speed = OFF;
	}

	public int getSpeed() {
		return speed;
	}
}
