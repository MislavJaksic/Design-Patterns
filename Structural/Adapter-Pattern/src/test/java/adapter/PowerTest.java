package adapter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class PowerTest {
	@Nested
	class ClientTests {
		@Test
		public void testAdapter() {
			TwoPhaseAppliance appliance = new TwoPhaseAppliance();
			
			String expected = "power";
			assertEquals(expected, appliance.powerOn());
		}
	}
}