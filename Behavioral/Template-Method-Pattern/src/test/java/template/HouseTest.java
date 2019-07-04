package template;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class HouseTest {
	@Nested
	class ConcreteHouseTests {
		ConcreteHouse house = new ConcreteHouse();
		
		@Test
		public void testBuild() {
			String expected = "concrete walls concrete roof";
			
			assertEquals(expected, house.build());
		}
	}
	
	@Nested
	class WoddenHouseTests {
		WoodenHouse house = new WoodenHouse();
		
		@Test
		public void testBuild() {
			String expected = "wooden walls wooden roof";
			
			assertEquals(expected, house.build());
		}
	}
}
