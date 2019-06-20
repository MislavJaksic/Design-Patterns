package observer.subject;

public interface WeatherDataCollector {
	public int getHumidity();
	public int getPressure();
	
	public void setHumidity(int humidity);
	public void setPressure(int pressure);
}
