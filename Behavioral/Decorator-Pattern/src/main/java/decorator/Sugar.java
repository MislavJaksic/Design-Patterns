package decorator;

import decorated.Drink;

public class Sugar extends ExtraDecorator {
	Drink drink;
	
	public Sugar(Drink drink) {
		this.drink = drink;
	}



	@Override
	public int Cost() {
		return this.drink.Cost() + 2;
	}

}
