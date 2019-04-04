package factory;

import java.util.Random;

import zoo.Animal;
import zoo.Deer;
import zoo.Rabbit;

public class RandomAnimalFactory implements AnimalFactory {

	@Override
	public Animal CreateAnimal() {
		Random randomizer = new Random(); 
		int value = randomizer.nextInt(3);
		
		Animal animal;
		if (value > -1 && value < 1) {
			animal = new Rabbit();
		} else if (value > 0 && value < 2) {
			animal = new Deer();
		} else if (value > 1 && value < 3) {
			animal = new Wolf();
		}
		
		return animal;
	}
}
