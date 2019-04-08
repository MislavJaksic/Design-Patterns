package factory;

import zoo.Animal;
import zoo.Deer;
import zoo.Rabbit;

public class RandomHerbivourFactory implements AnimalFactory {
	
	@Override
	public Animal CreateAnimal(int value) {
		Animal animal = null;
		if (value > -1 && value < 1) {
			animal = new Rabbit();
		} else if (value > 0 && value < 2) {
			animal = new Deer();
		}
		
		return animal;
	}
}
