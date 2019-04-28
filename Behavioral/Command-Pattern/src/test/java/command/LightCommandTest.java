package command;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import command.invoker.Remote;
import command.receiver.Light;

public class LightCommandTest {
	@Nested
	class LightTests {
		Light light = new Light();
		
		OnCommand turn_on = new OnCommand(light);
		DimCommand dim_down = new DimCommand(light);
		
		Remote remote = new Remote(turn_on, dim_down);
		
		@Test
		public void TestTurnOn() {
			remote.pressOn();
			assertEquals(true, light.isOn());
		}
		
		@Test
		public void TestTurnOff() {
			remote.pressOff();
			assertEquals(false, light.isOn());
		}
		
		@Test
		public void TestDim() {
			remote.pressDim();
			assertEquals(true, light.isDim());
		}
		
		@Test
		public void TestBrighten() {
			remote.pressBrigten();
			assertEquals(false, light.isDim());
		}
	}
}
