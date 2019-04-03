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
		public void SimpleTeaTest() {
			int expected = 100;
					
			int actual = tea.Cost();
			
			assertEquals(expected, actual);
		}
		
		@Test
		public void MilkyTeaTest() {
			int expected = 101;
			
			Drink milky_tea = new Milk(tea);
			int actual = milky_tea.Cost();
			
			assertEquals(expected, actual);
		}
		
		@Test
		public void SweetTeaTest() {
			int expected = 102;
			
			Drink sweet_tea = new Sugar(tea);
			int actual = sweet_tea.Cost();
			
			assertEquals(expected, actual);
		}
		
		@Test
		public void SweetMilkyTeaTest() {
			int expected = 103;
			
			Drink sweet_tea = new Sugar(tea);
			Drink sweet_milky_tea = new Milk(sweet_tea);
			int actual = sweet_milky_tea.Cost();
			
			assertEquals(expected, actual);
		}
		
		@Test
		public void MilkyDoubleSweetTeaTest() {
			int expected = 105;
			
			Drink sweet_tea = new Sugar(tea);
			Drink sweet_milky_tea = new Milk(sweet_tea);
			Drink sweet_sweet_milky_tea = new Sugar(sweet_milky_tea);
			int actual = sweet_sweet_milky_tea.Cost();
			
			assertEquals(expected, actual);
		}
	}
}