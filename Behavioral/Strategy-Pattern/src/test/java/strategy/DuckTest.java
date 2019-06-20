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
		public void testFly() {
			String expected = "no fly";
			assertEquals(expected, rubber_duck.fly());
		}
		
		@Test
		public void testQuack() {
			String expected = "no quack";
			assertEquals(expected, rubber_duck.quack());
		}
		
		@Test
		public void testDisplay() {
			String expected = "graphic display";
			assertEquals(expected, rubber_duck.display());
		}
	}
	
	@Nested
	class HighDuckTests {
		DuckClient sky_duck = new DuckClient(new HighFlyStrategy(), new LoudQuackStrategy(), new GraphicDisplayStrategy());
		
		@Test
		public void testFly() {
			String expected = "high fly";
			assertEquals(expected, sky_duck.fly());
		}
		
		@Test
		public void testQuack() {
			String expected = "loud quack";
			assertEquals(expected, sky_duck.quack());
		}
		
		@Test
		public void testDisplay() {
			String expected = "graphic display";
			assertEquals(expected, sky_duck.display());
		}
	}
}
