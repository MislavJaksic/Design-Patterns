package decorator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import decorated.Drink;
import decorated.Tea;

public class DrinkTest {

	@Nested
	class TeaTests {
		Drink tea = new Tea();
		
		@Test
		public void simpleTeaTest() {
			int expected = 10;
					
			int actual = tea.cost();
			
			assertEquals(expected, actual);
		}
		
		@Test
		public void milkyTeaTest() {
			int expected = 110;
			
			Drink milky_tea = new Milk(tea);
			int actual = milky_tea.cost();
			
			assertEquals(expected, actual);
		}
		
		@Test
		public void sweetTeaTest() {
			int expected = 1010;
			
			Drink sweet_tea = new Sugar(tea);
			int actual = sweet_tea.cost();
			
			assertEquals(expected, actual);
		}
		
		@Test
		public void sweetMilkyTeaTest() {
			int expected = 1110;
			
			Drink sweet_tea = new Sugar(tea);
			Drink sweet_milky_tea = new Milk(sweet_tea);
			int actual = sweet_milky_tea.cost();
			
			assertEquals(expected, actual);
		}
		
		@Test
		public void milkyDoubleSweetTeaTest() {
			int expected = 2110;
			
			Drink sweet_tea = new Sugar(tea);
			Drink sweet_milky_tea = new Milk(sweet_tea);
			Drink sweet_sweet_milky_tea = new Sugar(sweet_milky_tea);
			int actual = sweet_sweet_milky_tea.cost();
			
			assertEquals(expected, actual);
		}
	}
}