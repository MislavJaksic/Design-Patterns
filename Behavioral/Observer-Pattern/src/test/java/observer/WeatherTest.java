package observer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import observer.observer.MonitorDisplay;
import observer.observer.PhoneDisplay;
import observer.subject.WeatherStation;

public class WeatherTest {
	@Nested
	class MonitorDisplayTests {
		WeatherStation station = new WeatherStation();
		MonitorDisplay display = new MonitorDisplay(station);
		
		@BeforeEach
		public void registerDisplay() {
			station.addObserver(display);
		}
		
		@Test
		public void testHumidity() {
			int expected = 100;
			
			station.setHumidity(expected);
			
			assertEquals(expected, display.humidity);
		}
		
		@Test
		public void testPressure() {
			int expected = 100;
			
			station.setPressure(expected);
			
			assertEquals(expected, display.pressure);
		}
	}
	
	@Nested
	class PhoneDisplayTests {
		WeatherStation station = new WeatherStation();
		PhoneDisplay display = new PhoneDisplay(station);
		
		@BeforeEach
		public void registerDisplay() {
			station.addObserver(display);
		}
		
		@Test
		public void testHumidity() {
			int expected = 100;
			
			station.setHumidity(expected);
			
			assertEquals(expected, display.humidity);
		}
		
		@Test
		public void testPressure() {
			int expected = 100;
			
			station.setPressure(expected);
			
			assertEquals(expected, display.pressure);
		}
	}
}
