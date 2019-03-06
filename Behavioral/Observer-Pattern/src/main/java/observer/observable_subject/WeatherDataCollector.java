package observer.observable_subject;

public interface WeatherDataCollector {
	public int GetHumidity();
	public int GetPressure();
	
	public void SetHumidity(int humidity);
	public void SetPressure(int pressure);
}
