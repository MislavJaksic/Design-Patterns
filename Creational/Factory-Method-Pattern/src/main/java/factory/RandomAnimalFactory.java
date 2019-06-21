package factory;

import zoo.Animal;
import zoo.Deer;
import zoo.Rabbit;
import zoo.Wolf;

public class RandomAnimalFactory implements AnimalFactory {
	@Override
	public Animal getAnimal(double value) {
		Animal animal = null;
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
