package factory;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


public class GenericTest {

	@Nested
	class TeaTests {

		@Test
		public void SimpleTeaTest() {
			int expected = 100;


			assertEquals(expected, true);
		}
	}
}
