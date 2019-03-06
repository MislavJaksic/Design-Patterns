package observer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import observer.observable_subject.WeatherStation;
import observer.observer.MonitorDisplay;
import observer.observer.PhoneDisplay;

public class WeatherTest {
	@Nested
	class MonitorDisplayTests {
		WeatherStation station = new WeatherStation();
		MonitorDisplay display = new MonitorDisplay(station);
		
		@BeforeEach
		public void RegisterDisplay() {
			station.AddObserver(display);
		}
		
		@Test
		public void TestHumidity() {
			int expected = 100;
			
			station.SetHumidity(expected);
			
			assertEquals(expected, display.humidity);
		}
		
		@Test
		public void TestPressure() {
			int expected = 100;
			
			station.SetPressure(expected);
			
			assertEquals(expected, display.pressure);
		}
	}
	
	@Nested
	class PhoneDisplayTests {
		WeatherStation station = new WeatherStation();
		PhoneDisplay display = new PhoneDisplay(station);
		
		@BeforeEach
		public void RegisterDisplay() {
			station.AddObserver(display);
		}
		
		@Test
		public void TestHumidity() {
			int expected = 100;
			
			station.SetHumidity(expected);
			
			assertEquals(expected, display.humidity);
		}
		
		@Test
		public void TestPressure() {
			int expected = 100;
			
			station.SetPressure(expected);
			
			assertEquals(expected, display.pressure);
		}
	}
}
