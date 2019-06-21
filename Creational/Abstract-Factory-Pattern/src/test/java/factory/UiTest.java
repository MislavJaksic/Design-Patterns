package factory;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import ui.Alert;
import ui.Button;

public class UiTest {
	@Nested
	class LinuxTests {
		UiAbstractFactory factory = new LinuxUiFactory();

		@Test
		public void alertTest() {
			Alert alert = factory.getAlert();
			String actual = alert.yell();
			
			String expected = "linux alert";

			assertEquals(expected, actual);
		}
		
		@Test
		public void buttonTest() {
			Button button = factory.getButton();
			String actual = button.show();
			
			String expected = "linux button";

			assertEquals(expected, actual);
		}
	}
	
	@Nested
	class WindowsTests {
		UiAbstractFactory factory = new WindowsUiFactory();

		@Test
		public void alertTest() {
			Alert alert = factory.getAlert();
			String actual = alert.yell();
			
			String expected = "windows alert";

			assertEquals(expected, actual);
		}
		
		@Test
		public void buttonTest() {
			Button button = factory.getButton();
			String actual = button.show();
			
			String expected = "windows button";

			assertEquals(expected, actual);
		}
	}
}
