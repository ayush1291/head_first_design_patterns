package com.observer.step2;

import java.util.ArrayList;
import java.util.List;

import com.observer.common.Observer;
import com.observer.common.Subject;

public class WeatherData implements Subject{
	int p1;
	int p2;

	List<Observer> observers = new ArrayList<>(); 
	
	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		//To remove
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(p1,p2);
		}
	}
	
	public void onChange(){
		//*********Sensors update this value
		notifyObservers();
	}

}
