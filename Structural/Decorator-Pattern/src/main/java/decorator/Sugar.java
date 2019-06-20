package decorator;

import decorated.Drink;

public class Sugar extends ExtraDecorator {
	Drink drink;
	
	public Sugar(Drink drink) {
		this.drink = drink;
	}



	@Override
	public int cost() {
		return this.drink.cost() + 1000;
	}

}
