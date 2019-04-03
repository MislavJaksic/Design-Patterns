package decorator;

import decorated.Drink;

public class Milk extends ExtraDecorator {
	Drink drink;
	
	public Milk(Drink drink) {
		this.drink = drink;
	}
	
	
	
	@Override
	public int Cost() {
		return this.drink.Cost() + 1;
	}
}
