package com.observer.step2;

//Here, the code is extensible as without changing anything we can add or remove any observer at run time
//We add subject to the cponstructor as we want to remove the observer also \

//We pass the subject to observer constructor as it is in hands of observer to subscribe or not

//Here , in subject our update method takes the params, but in real time this will be a problem if a new barometer is added 
// So, better to go for pulling rather than pushing

public class Client {

	public static void main(String[] args) {
		WeatherData weather = new WeatherData();
		Display1 dis1 = new Display1(weather);
		Display2 dis2 = new Display2(weather);
		
	
		//Chnaging valyes for weather
		weather.p1=10;
		weather.p2=20;
		weather.notifyObservers();
	}
}
