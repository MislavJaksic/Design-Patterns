package observer.observer;

import observer.observable_subject.WeatherDataCollector;

public class MonitorDisplay implements Observer {
	public int humidity = -1;
	public int pressure = -1;
	
	WeatherDataCollector weather_collector;
	
	

	public MonitorDisplay(WeatherDataCollector weather_collector) {
		this.weather_collector = weather_collector;
	}


	
	@Override
	public void Update() {
		this.humidity = this.weather_collector.GetHumidity();
		this.pressure = this.weather_collector.GetPressure();
	}
}
