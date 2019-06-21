package factory;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import factory.AnimalFactory;
import factory.RandomAnimalFactory;
import zoo.Animal;


public class ZooTest {
	@Nested
	class AnimalTests {
		AnimalFactory factory = new RandomAnimalFactory();

		@Test
		public void createWolfTest() {
			Animal animal = factory.getAnimal(2.0);
			String actual = animal.speak();
			
			String expected = "wolf";

			assertEquals(expected, actual);
		}
	}
}
