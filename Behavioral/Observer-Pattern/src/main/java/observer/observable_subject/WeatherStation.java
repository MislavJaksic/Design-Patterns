package observer.observable_subject;

import java.util.ArrayList;

import observer.observer.Observer;

public class WeatherStation implements ObservableSubject, WeatherDataCollector {
	private int humidity = -1;
	private int pressure = -1;
	
	private ArrayList<Observer> registered_observers = new ArrayList<Observer>();
	
	
	
	@Override
	public void AddObserver(Observer observer) {
		if (this.IsNotRegistered(observer)) {
			this.registered_observers.add(observer);
		}
	}

	@Override
	public void RemoveObserver(Observer observer) {
		if (this.IsRegistered(observer)) {
			this.registered_observers.remove(observer);
		}
	}

	@Override
	public void NotifyObservers() {
		for (int i = 0; i < this.registered_observers.size(); i++) {
			this.registered_observers.get(i).Update();
		}
	}
	
	
	/*
	 * Do work.
	 */
	@Override
	public int GetHumidity() {
		return this.humidity;
	}

	@Override
	public int GetPressure() {
		return this.pressure;
	}
	
	@Override
	public void SetHumidity(int humidity) {
		this.humidity = humidity;
		this.NotifyObservers();
	}

	@Override
	public void SetPressure(int pressure) {
		this.pressure = pressure;
		this.NotifyObservers();
	}
	
	
	
	private boolean IsRegistered(Observer observer) {
		if (this.IsNotRegistered(observer)) {
			return false;
		}
		return true;
	}
	
	private boolean IsNotRegistered(Observer observer) {
		if (this.registered_observers.indexOf(observer) == -1) {
			return true;
		}
		return false;
	}
}
