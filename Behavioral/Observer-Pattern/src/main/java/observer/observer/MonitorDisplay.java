package observer.observer;

import observer.subject.WeatherDataCollector;

public class MonitorDisplay implements Observer {
	public int humidity = -1;
	public int pressure = -1;
	
	WeatherDataCollector weather_collector;
	
	

	public MonitorDisplay(WeatherDataCollector weather_collector) {
		this.weather_collector = weather_collector;
	}


	
	@Override
	public void update() {
		this.humidity = this.weather_collector.getHumidity();
		this.pressure = this.weather_collector.getPressure();
	}
}
