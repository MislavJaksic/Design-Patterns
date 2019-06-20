package factory;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import zoo.Animal;


public class ZooTest {

	@Nested
	class AnimalTests {
		AnimalFactory factory = new RandomAnimalFactory();

		@Test
		public void CreateWolfTest() {
			Animal animal = factory.CreateAnimal(2);
			String actual = animal.Speak();
			
			String expected = "wolf";

			assertEquals(expected, actual);
		}
	}
}
