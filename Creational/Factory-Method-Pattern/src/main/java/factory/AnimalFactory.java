package factory;

import zoo.Animal;

/**
 * Factory method Creator.
 */
public interface AnimalFactory {
	/**
	 * THE Factory method.
	 */
	public Animal getAnimal(double value);
}
