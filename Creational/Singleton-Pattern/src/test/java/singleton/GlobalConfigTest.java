package singleton;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class GlobalConfigTest {
	@Nested
	class SingletonTests {
		GlobalConfig config = GlobalConfig.getInstance();
		
		@Test
		public void numerTest() {
			assertEquals(42, config.getSecretNumber());
		}
		
		@Test
		public void wordTest() {
			assertEquals("sh", config.getSecretWord());
		}
	}
}
