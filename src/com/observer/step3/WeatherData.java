package com.observer.step3;

import java.util.Observable;

//Here, problem is we are extending a class, so any other thing cannot be implemented

//set changed is a protected method, so rather than composition we use inheritance which is bad here

// supports both pushing(by supplying an extra data object - look the framework) and pulling----------

// Read notifyObservers method

//setchanged method is given as if out=r barometer is tooooo sensitive, then we dont want update to happen very frequently, so set changed will be true when we want to notify
public class WeatherData extends Observable{
	
	@Override
	protected synchronized void setChanged() {
		super.setChanged();
	}

}
