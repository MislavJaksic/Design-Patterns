package bridge;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import bridge.page.About;
import bridge.page.Main;
import bridge.theme.Dark;
import bridge.theme.Light;

public class WebTests {
	@Nested
	class PageTests {
		@Test
		public void aboutDarkFly() {
			About page = new About(new Dark());
			String expected = "about dark";
			
			assertEquals(expected, page.show());
		}
		
		@Test
		public void aboutLightFly() {
			About page = new About(new Light());
			String expected = "about light";
			
			assertEquals(expected, page.show());
		}
		
		@Test
		public void mainDarkFly() {
			Main page = new Main(new Dark());
			String expected = "main dark";
			
			assertEquals(expected, page.show());
		}
		
		@Test
		public void mainLightFly() {
			Main page = new Main(new Light());
			String expected = "main light";
			
			assertEquals(expected, page.show());
		}
	}
}
