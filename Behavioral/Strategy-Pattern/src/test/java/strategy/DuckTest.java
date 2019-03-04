package strategy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import strategy.client.DuckClient;
import strategy.display.GraphicDisplayStrategy;
import strategy.fly.HighFlyStrategy;
import strategy.fly.NoFlyStrategy;
import strategy.quack.LoudQuackStrategy;
import strategy.quack.NoQuackStrategy;

public class DuckTest {

	@Nested
	class RubberDuckTests {
		DuckClient rubber_duck = new DuckClient(new NoFlyStrategy(), new NoQuackStrategy(), new GraphicDisplayStrategy());
		
		@Test
		public void TestFly() {
			String expected = "no fly";
			assertEquals(expected, rubber_duck.Fly());
		}
		
		@Test
		public void TestQuack() {
			String expected = "no quack";
			assertEquals(expected, rubber_duck.Quack());
		}
		
		@Test
		public void TestDisplay() {
			String expected = "graphic display";
			assertEquals(expected, rubber_duck.Display());
		}
	}
	
	@Nested
	class HighDuckTests {
		DuckClient sky_duck = new DuckClient(new HighFlyStrategy(), new LoudQuackStrategy(), new GraphicDisplayStrategy());
		
		@Test
		public void TestFly() {
			String expected = "high fly";
			assertEquals(expected, sky_duck.Fly());
		}
		
		@Test
		public void TestQuack() {
			String expected = "loud quack";
			assertEquals(expected, sky_duck.Quack());
		}
		
		@Test
		public void TestDisplay() {
			String expected = "graphic display";
			assertEquals(expected, sky_duck.Display());
		}
	}
}
