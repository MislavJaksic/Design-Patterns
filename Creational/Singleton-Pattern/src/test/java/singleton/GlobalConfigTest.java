package singleton;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class GlobalConfigTest {
	@Nested
	class SingletonTests {
		GlobalConfig config = GlobalConfig.getInstance();
		
		@Test
		public void TestNumber() {
			assertEquals(42, config.getSecret_number());
		}
		
		@Test
		public void TestWord() {
			assertEquals("sh", config.getSecret_word());
		}
	}
}
