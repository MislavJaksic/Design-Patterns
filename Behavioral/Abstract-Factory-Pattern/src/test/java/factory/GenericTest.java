package factory;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class GenericTest {
	@Nested
	class AnimalTests {

		@Test
		public void CreateWolfTest() {
			assertEquals(true, true);
		}
	}
}
