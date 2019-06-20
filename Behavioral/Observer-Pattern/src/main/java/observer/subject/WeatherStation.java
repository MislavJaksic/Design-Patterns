package observer.subject;

import java.util.ArrayList;
import java.util.List;

import observer.observer.Observer;

public class WeatherStation implements Subject, WeatherDataCollector {
	private int humidity = -1;
	private int pressure = -1;
	
	private List<Observer> observers = new ArrayList<Observer>();
	
	
	
	@Override
	public void addObserver(Observer observer) {
		if (this.isNotRegistered(observer)) {
			this.observers.add(observer);
		}
	}

	@Override
	public void removeObserver(Observer observer) {
		if (this.isRegistered(observer)) {
			this.observers.remove(observer);
		}
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : this.observers) {
			observer.update();
		}
	}
	
	
	/*
	 * Do work.
	 */
	@Override
	public int getHumidity() {
		return this.humidity;
	}

	@Override
	public int getPressure() {
		return this.pressure;
	}
	
	@Override
	public void setHumidity(int humidity) {
		this.humidity = humidity;
		this.notifyObservers();
	}

	@Override
	public void setPressure(int pressure) {
		this.pressure = pressure;
		this.notifyObservers();
	}
	
	
	
	private boolean isRegistered(Observer observer) {
		if (this.isNotRegistered(observer)) {
			return false;
		}
		return true;
	}
	
	private boolean isNotRegistered(Observer observer) {
		if (this.observers.indexOf(observer) == -1) {
			return true;
		}
		return false;
	}
}
